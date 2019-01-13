package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The recursion for triangulations with minimum degree at least 4.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min4Scanner {

  private static final int[] ZERO = new int[Plantri.MAX_VERTICES];   /* permanently 0 */

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Numbering mNumbering;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final int mMaxNV;
  private final int mMinConnec;
  private final boolean mPSwitch;
  private final ExtenderReducer mBatagelj4;
  private final ExtenderReducer mBatagelj5;
  private final ExtenderReducer mBatageljS;
  private final boolean mNeedGroup;
  private final EdgeFactory mEdgeFactory;

  Min4Scanner(final Plantri plantri, final Numbering numbering, final int maxNV, final int minConnec, final boolean pSwitch, final boolean needGroup) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mMaxNV = maxNV;
    mMinConnec = minConnec;
    mPSwitch = pSwitch;
    mBatagelj4 = new Batagelj4ExtenderReducer(mState);
    mBatagelj5 = new Batagelj5ExtenderReducer(mState);
    mBatageljS = new BatageljSExtenderReducer(mState);
    mNeedGroup = needGroup;
    mEdgeFactory = plantri.mEdgeFactory;
  }

  /* Test if ref (known to be an edge!) is the reference edge of a
       legal four-reduction in the min4 case.
       Return 1 if it is, and 0 if it isn't.
    */
  private boolean isMin4Four(final Edge ref) {
    if (mDegree[ref.mStart] != 4) {
      return false;
    } else if (mDegree[ref.mPrev.mEnd] == 4 || mDegree[ref.mNext.mEnd] == 4) {
      return false;
    }
    final int w = ref.mNext.mNext.mEnd;
    if (mDegree[w] == 4) {
      return true;
    }
    Edge e = ref.mInverse;
    final Edge elast = e.mPrev;
    for (e = e.mNext.mNext; e != elast; e = e.mNext) {
      if (e.mEnd == w) {
        return false;
      }
    }
    return true;
  }

  private void mark(final Edge[] ext4, final int k, final Edge e) {
    ext4[k] = e;
    mEdgeFactory.markLo(e);
    mEdgeFactory.markLo(e.mInverse);
  }

  /* nbtot is the number of automorphisms.  If known!=null, it is the
     reference edge of a canonical four-extension just used to make the
     graph.  See min4FourLegal() for important comments about what makes
     a four-extension canonical.  This procedure makes a list in
     ext4[0..*next4-1] of undirected edges whose use in a four-extension
     might possible be canonical.
  */
  private int findExtensionsMin4Four(final int nbtot, final Edge[] ext4, Edge known) {
    int deg2 = 0;
    mEdgeFactory.resetMarks(mEdges);
    int k = 0;
    int deg1;
    if (known != null) {
      deg1 = mDegree[known.mEnd];
      deg2 = mDegree[known.mNext.mNext.mEnd];
      if (deg1 < deg2) {
        final int i = deg1;
        deg1 = deg2;
        deg2 = i;
        known = known.mNext.mNext;
      }
      Edge e2 = null;
      Edge ez = known.mInverse;
      final Edge ezlim = ez.mPrev;
      int deg3 = 0;
      for (ez = ez.mNext.mNext; ez != ezlim; ez = ez.mNext) {
        if (isMin4Four(ez.mInverse)) {
          final int kk = mDegree[ez.mInverse.mNext.mNext.mEnd];
          if (kk > deg3) {
            deg3 = kk;
            e2 = ez;
          }
        }
      }
      if (deg3 == 0) {
        // edges around the outside
        Edge e = known.mInverse.mNext;
        mark(ext4, k++, e);
        e = e.mInverse.mNext.mNext;
        mark(ext4, k++, e);
        e = e.mInverse.mNext.mNext;
        mark(ext4, k++, e);
        e = e.mInverse.mNext.mNext;
        mark(ext4, k++, e);
        // edges in the middle
        e = known;
        mark(ext4, k++, e);
        e = e.mNext;
        mark(ext4, k++, e);
        e = e.mNext;
        if (deg2 == deg1) {
          mark(ext4, k++, e);
        }
        e = e.mNext;
        mark(ext4, k++, e);
      } else {
        final int dega = mDegree[known.mPrev.mEnd];
        final int degb = mDegree[known.mNext.mEnd];
        // edges around the outside
        Edge e = known.mInverse.mNext;
        if (dega >= deg3 || e.mNext == e2) {
          mark(ext4, k++, e);
        }
        e = e.mInverse.mNext.mNext;
        if (deg1 == deg2 && dega >= deg3) {
          mark(ext4, k++, e);
        }
        e = e.mInverse.mNext.mNext;
        if (deg1 == deg2 && degb >= deg3) {
          mark(ext4, k++, e);
        }
        e = e.mInverse.mNext.mNext;
        if (degb >= deg3 || e.mInverse.mPrev == e2) {
          mark(ext4, k++, e);
        }
        // edges in the middle
        e = known;
        if (deg3 == 4) {
          mark(ext4, k++, e);
        }
        e = e.mNext;
        if (degb > deg1 + 1 || (degb == deg1 + 1 && deg3 == 4)) {
          mark(ext4, k++, e);
        }
        e = e.mNext;
        if (deg1 == deg2 && deg3 == 4) {
          mark(ext4, k++, e);
        }
        e = e.mNext;
        if (dega > deg1 + 1 || (dega == deg1 + 1 && deg3 == 4)) {
          mark(ext4, k++, e);
        }
      }
    } else {
      deg1 = 0;
    }
    for (int v = 0; v < mState.mNumVertices; ++v) {
      if (mDegree[v] > deg1) {
        final Edge elast = mFirstEdge[v];
        Edge e = elast;
        do {
          if (!mEdgeFactory.isMarkedLo(e)) {
            mark(ext4, k++, e);
          }
          e = e.mNext;
        } while (e != elast);
      } else if (mDegree[v] == deg1) {
        final Edge elast = mFirstEdge[v];
        Edge e = elast;
        do {
          if (mDegree[e.mEnd] >= deg2 && !mEdgeFactory.isMarkedLo(e)) {
            mark(ext4, k++, e);
          }
          e = e.mNext;
        } while (e != elast);
      }
    }
    if (nbtot > 1) {
      for (int i = 0; i < mState.mNumEdges; ++i) {
        mNumbering.get(0, i).mIndex = i;
      }
      int kk = 0;
      mEdgeFactory.resetMarks(mEdges);
      for (int i = 0; i < k; ++i) {
        if (!mEdgeFactory.isMarkedLo(ext4[i])) {
          ext4[kk++] = ext4[i];
          final int q = ext4[i].mIndex;
          mNumbering.markLo(1, nbtot, q);
          mNumbering.inverseMarkLo(1, nbtot, q);
        }
      }
      k = kk;
    }
    return k;
  }

  /* Return 1 if there are at least three vertices which are centres
     for a four-reduction (min4 case).  Return 0 otherwise.
  */
  private boolean has3FourCentres() {
    int count = 0;
    for (int v = mState.mNumVertices; --v >= 0; ) {
      if (mDegree[v] == 4) {
        final Edge e = mFirstEdge[v];
        if ((mDegree[e.mPrev.mEnd] >= 5 && mDegree[e.mNext.mEnd] >= 5)
          || (mDegree[e.mEnd] >= 5 && mDegree[e.mNext.mNext.mEnd] >= 5)) {
          if (++count == 3) {
            return true;
          }
        }
      }
    }
    return count >= 3;
  }

  /* Determine the inequivalent places to make extensions, for the
     ordinary triangulations of minimum degree 4.  The results are
     put in the arrays ext4[0..*next4-1], etc..
     nbtot and nbop are the usual group parameters.

     If known!=null, it is the reference edge of a known four-reduction.
  */
  private void findExtensionsMin4(final int nbtot, final int nbop, final Edge[] ext4, final MutableInteger next4,
                                  final Edge[] ext5, final MutableInteger next5, final Edge[] extS, final MutableInteger nextS, final Edge known) {
    next4.set(findExtensionsMin4Four(nbtot, ext4, known));
    final boolean manycentres = has3FourCentres();
    if (nbtot == 1) {
      // five-extensions, trivial group
      if (manycentres) {
        next5.set(0);
      } else if (known != null) {
        int k = 0;
        Edge e = known;
        for (int i = 0; i < 4; ++i, e = e.mNext) {
          if (mDegree[e.mEnd] >= 6) {
            ext5[k++] = e.mInverse.mPrev.mInverse;
            ext5[k++] = e.mInverse.mNext.mNext.mInverse;
          }
        }
        next5.set(k);
      } else {
        int k = 0;
        for (int i = 0; i < mState.mNumVertices; ++i) {
          if (mDegree[i] >= 6) {
            final Edge elast = mFirstEdge[i];
            Edge e = elast;
            do {
              ext5[k++] = e.mInverse;
              e = e.mNext;
            } while (e != elast);
          }
        }
        next5.set(k);
      }
      // S-extensions, trivial group
      int k = 0;
      if (mState.mNumVertices <= mMaxNV - 3) {
        for (int i = 0; i < mState.mNumVertices; ++i) {
          final Edge elast = mFirstEdge[i];
          Edge e = elast;
          do {
            Edge e1 = e.mInverse.mPrev;
            if (e1.mAlloc > e.mAlloc) {
              e1 = e1.mInverse.mPrev;
              if (e1.mAlloc > e.mAlloc) {
                extS[k++] = e;
              }
            }
            e = e.mNext;
          } while (e != elast);
        }
      }
      nextS.set(k);
    } else {
      // five-extensions, non-trivial group
      if (manycentres) {
        next5.set(0);
      } else {
        final int nboplim = nbop == 0 ? nbtot : nbop;
        mEdgeFactory.resetMarks(mEdges);
        int k = 0;
        for (int i = 0; i < mState.mNumEdges; ++i) {
          final Edge e = mNumbering.get(0, i);
          if (mDegree[e.mStart] >= 6 && !mEdgeFactory.isMarkedLo(e)) {
            ext5[k++] = e.mNext.mInverse;
            mNumbering.prevMarkLo(mNumbering.markLo(1, nboplim, i), nbtot, i);
          }
        }
        next5.set(k);
      }
      // S-extensions, non-trivial group
      int k = 0;
      if (mState.mNumVertices <= mMaxNV - 3) {
        final int nboplim = nbop == 0 ? nbtot : nbop;
        mEdgeFactory.resetMarks(mEdges);
        for (int i = 0; i < mState.mNumEdges; ++i) {
          mNumbering.get(0, i).mIndex = i;
        }
        for (int i = 0; i < mState.mNumEdges; ++i) {
          final Edge e = mNumbering.get(0, i);
          if (mEdgeFactory.isMarkedLo(e)) {
            continue;
          }
          extS[k++] = e;
          mNumbering.inverseMarkLo(mNumbering.markLo(0, nboplim, i), nbtot, i);
          Edge e1 = e.mInverse.mPrev;
          mNumbering.inverseMarkLo(mNumbering.markLo(0, nboplim, e1.mIndex), nbtot, e1.mIndex);
          e1 = e1.mInverse.mPrev;
          mNumbering.inverseMarkLo(mNumbering.markLo(0, nboplim, e1.mIndex), nbtot, e1.mIndex);
        }
      }
      nextS.set(k);
    }
  }

  /* Make new list of non-facial triangles after a four-extension. */
  private static int updateNftFour(final Triangle[] nft, final int numnft, final Edge ref, final Triangle[] newnft) {
    final Edge refmin = ref.mMin;
    // Remove triangles that include ref
    int k = 0;
    for (int i = 0; i < numnft; ++i) {
      if (nft[i].mEdge1 != refmin && nft[i].mEdge2 != refmin && nft[i].mEdge3 != refmin) {
        newnft[k++] = nft[i];
      }
    }
    // Add a shortcut if there is one (only possible if there are >= 2 others)
    if (k >= 2) {
      final int w = ref.mNext.mEnd;
      final Edge elast = ref.mInverse.mNext.mInverse;
      Edge e;
      for (e = elast.mNext.mNext.mNext; e != elast; e = e.mNext) {
        if (e.mEnd == w) {
          break;
        }
      }
      if (e != elast) {
        newnft[k] = new Triangle();
        newnft[k].mEdge1 = e.mMin;
        newnft[k].mEdge2 = ref.mPrev.mMin;
        newnft[k].mEdge3 = ref.mNext.mMin;
        ++k;
      }
    }
    return k;
  }

  /* Make new list of non-facial triangles after a five-extension. */
  private static int updateNftFive(final Triangle[] nft, final int numnft, final Edge ref,
                                   final Triangle[] newnft) {
    final Edge refmin = ref.mMin;
    final Edge amin = ref.mNext.mNext.mMin;
    // Remove triangles that include either of the former two chords
    int k = 0;
    for (int i = 0; i < numnft; ++i) {
      if (nft[i].mEdge1 != refmin && nft[i].mEdge2 != refmin && nft[i].mEdge3 != refmin
        && nft[i].mEdge1 != amin && nft[i].mEdge2 != amin && nft[i].mEdge3 != amin) {
        newnft[k++] = nft[i];
      }
    }
    // Add a shortcut if there is one (only possible if there is another)
    if (k == 0) {
      return 0;
    }
    Edge e, elast, ee = ref.mPrev.mPrev;
    for (int j = 0; j < 3; ee = ee.mNext.mNext, ++j) {
      final int w = ee.mNext.mEnd;
      elast = ee.mInverse.mNext.mInverse;
      for (e = elast.mNext.mNext.mNext; e != elast; e = e.mNext) {
        if (e.mEnd == w) {
          break;
        }
      }
      if (e != elast) {
        newnft[k] = new Triangle();
        newnft[k].mEdge1 = e.mMin;
        newnft[k].mEdge2 = ee.mPrev.mMin;
        newnft[k].mEdge3 = ee.mNext.mMin;
        ++k;
      }
    }
    return k;
  }


  /* Remove from ext4[0..*next4-1] and ext5[0..*next5-1] those extensions
     for which not all of nft[0..numnft-1] hit some chord. */
  private void nftLastStep(final Edge[] ext4, final MutableInteger next4, final Edge[] ext5, final MutableInteger next5,
                           final Triangle[] nft, final int numnft) {
    for (int j = 0; j < numnft; ++j) {
      mEdgeFactory.resetMarks(mEdges);
      mEdgeFactory.markLo(nft[j].mEdge1);
      mEdgeFactory.markLo(nft[j].mEdge1.mInverse);
      mEdgeFactory.markLo(nft[j].mEdge2);
      mEdgeFactory.markLo(nft[j].mEdge2.mInverse);
      mEdgeFactory.markLo(nft[j].mEdge3);
      mEdgeFactory.markLo(nft[j].mEdge3.mInverse);
      int k = 0;
      for (int i = 0; i < next4.get(); ++i) {
        if (mEdgeFactory.isMarkedLo(ext4[i])) {
          ext4[k++] = ext4[i];
        }
      }
      next4.set(k);
      k = 0;
      for (int i = 0; i < next5.get(); ++i) {
        if (mEdgeFactory.isMarkedLo(ext5[i]) || mEdgeFactory.isMarkedLo(ext5[i].mInverse.mPrev)) {
          ext5[k++] = ext5[i];
        }
      }
      next5.set(k);
    }
  }

  /* return 1 if v is the centre of a four-reduction, 0 if not. */
  private boolean isMin4FourCentre(final int v) {
    if (mDegree[v] != 4) {
      return false;
    }
    final Edge e = mFirstEdge[v];
    return (mDegree[e.mPrev.mEnd] >= 5 && mDegree[e.mNext.mEnd] >= 5)
      || (mDegree[e.mEnd] >= 5 && mDegree[e.mNext.mNext.mEnd] >= 5);
  }

  /* Return a vertex of degree 5, -1 if there are none */
  private int degree5Vertex() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 5) {
        return 1; // SAI: Huh? shouldn't this return i?
      }
    }
    return -1;
  }

  private static int fourType(final int d3, final int d4) {
    return (d3 << 10) + d4;
  }

  /* The four-operation with reference edge *ref has just been performed.
     Make a list in goodOr[0..nGoodOr-1] of the reference edges of
     legal four-reductions (oriented editions) that might be canonical,
     with the first nGoodRef of those being ref.
     Make a list in goodMir[0..*nGoodMir-1] of the
     reference edges of legal four-reductions (mirror-image editions)
     that might be canonical, with the first nGoodMirRef of those being
     ref.mNext.
     nGoodRef and nGoodMirRef might each be 0-2.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).
     Four-reductions have a priority: (maxDeg, minDeg) where those are
     the two degrees on the subdivided diagonal.  Bigger = better.
  */
  private void min4FourLegal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef, final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    long bestType = 0;
    long eType1 = 0;
    long eType2 = 0;
    long erType1 = 0;
    long erType2 = 0;
    long eType = 0;
    long erType = 0;
    int bestDeg = 0;
    int nextDeg = 0;
    Edge e = ref;
    Edge er = ref.mNext.mNext;
    final int deg1 = mDegree[e.mEnd];
    int deg2 = mDegree[er.mEnd];
    int deg3 = mDegree[e.mPrev.mEnd];
    int deg4 = mDegree[e.mNext.mEnd];
    int nor = 0;
    int nmir = 0;

    if (deg1 >= deg2) {
      bestDeg = deg1;
      nextDeg = deg2;
      eType1 = fourType(deg3, deg4);
      eType2 = fourType(deg4, deg3);
      bestType = eType = eType1 > eType2 ? eType1 : eType2;
    }
    if (deg1 <= deg2) {
      bestDeg = deg2;
      nextDeg = deg1;
      erType1 = fourType(deg4, deg3);
      erType2 = fourType(deg3, deg4);
      bestType = erType = erType1 > erType2 ? erType1 : erType2;
    }
    if (deg1 == deg2) {
      bestType = eType > erType ? eType : erType;
    }
    if (deg1 >= deg2) {
      if (eType1 == bestType) {
        goodOr[nor++] = e;
      }
      if (eType2 == bestType) {
        goodMir[nmir++] = e;
      }
    }
    if (deg1 <= deg2) {
      if (erType1 == bestType) {
        goodOr[nor++] = er;
      }
      if (erType2 == bestType) {
        goodMir[nmir++] = er;
      }
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);
    mEdgeFactory.resetMarks(mEdges);
    mEdgeFactory.markLo(e.mInverse);
    mEdgeFactory.markLo(er.mInverse);
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] > bestDeg) {
        final Edge eiLast = mFirstEdge[i];
        Edge ei = eiLast;
        do {
          if (mDegree[ei.mEnd] == 4 && isMin4Four(ei.mInverse)) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          }
          ei = ei.mNext;
        } while (ei != eiLast);
      } else if (mDegree[i] == bestDeg) {
        final Edge eiLast = mFirstEdge[i];
        Edge ei = eiLast;
        do {
          if (mDegree[ei.mEnd] == 4 && !mEdgeFactory.isMarkedLo(ei)) {
            e = ei.mInverse;
            er = e.mNext.mNext;
            final int w = er.mEnd;
            deg2 = mDegree[w];
            if (deg2 > nextDeg && isMin4Four(e)) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              return;
            } else if (deg2 == nextDeg && (bestDeg > nextDeg || i < w) && isMin4Four(e)) {
              deg3 = mDegree[e.mPrev.mEnd];
              deg4 = mDegree[e.mNext.mEnd];
              eType1 = fourType(deg3, deg4);
              eType2 = fourType(deg4, deg3);
              if (eType1 > bestType || eType2 > bestType) {
                nGoodRef.set(0);
                nGoodMirRef.set(0);
                return;
              }
              if (eType1 == bestType) {
                goodOr[nor++] = e;
              }
              if (eType2 == bestType) {
                goodMir[nmir++] = e;
              }
              if (nextDeg == bestDeg) {
                erType1 = fourType(deg4, deg3);
                erType2 = fourType(deg3, deg4);
                if (erType1 > bestType || erType2 > bestType) {
                  nGoodRef.set(0);
                  nGoodMirRef.set(0);
                  return;
                }
                if (erType1 == bestType) {
                  goodOr[nor++] = er;
                }
                if (erType2 == bestType) {
                  goodMir[nmir++] = er;
                }
              }
            }
          }
          ei = ei.mNext;
        } while (ei != eiLast);
      }
    }
    nGoodOr.set(nor);
    nGoodMir.set(nmir);
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      Pruner.pruneOrientedLists(goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mDegree);
    }
  }

  /* If there is a four-reduction, return the central vertex. If not, return -1. */
  private int min4FourCentre() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 4) {
        final Edge e = mFirstEdge[i];
        if ((mDegree[e.mPrev.mEnd] >= 5 && mDegree[e.mNext.mEnd] >= 5)
          || (mDegree[e.mEnd] >= 5 && mDegree[e.mNext.mNext.mEnd] >= 5)) {
          return i;
        }
      }
    }
    return -1;
  }

  /* The S-operation with reference edge *ref has just been performed.
     Make a list in goodOr[0..nGoodOr-1] of the reference edges of
     legal S-reductions (oriented editions) that might be canonical,
     with the first nGoodRef of those being ref.
     Make a list in goodMir[0..nGoodMir-1] of the
     reference edges of legal S-reductions (mirror-image editions)
     that might be canonical, with the first nGoodMirRef of those
     being ref.
     nGoodRef and nGoodMirRef might each be 0 or 1.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).

     Hopefully this routine is used rarely, so we are going for simple
     rather than fast.  If the S operation ever becomes a critical part
     of some generation, optimising this routine would be necessary.
  */
  private void min4SLegal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                          final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    mEdgeFactory.resetMarks(mEdges);
    Edge e = ref;
    int nor = 0;
    int nmir = 0;
    goodOr[nor++] = e;
    goodMir[nmir++] = e.mInverse;
    mEdgeFactory.markLo(e);
    Edge ee = e.mInverse.mPrev.mPrev.mPrev;
    goodOr[nor++] = ee;
    goodMir[nmir++] = ee.mInverse;
    mEdgeFactory.markLo(ee);
    ee = ee.mInverse.mPrev.mPrev.mPrev;
    goodOr[nor++] = ee;
    goodMir[nmir++] = ee.mInverse;
    mEdgeFactory.markLo(ee);
    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        e = mFirstEdge[i];
        for (int j = mDegree[i]; --j >= 0; e = e.mNext) {
          if (mEdgeFactory.isMarkedLo(e)) {
            continue;
          }
          if (mDegree[e.mEnd] < 6 || mDegree[e.mNext.mEnd] != 4 || mDegree[e.mNext.mNext.mEnd] != 4 || mDegree[e.mNext.mNext.mNext.mEnd] < 6) {
            continue;
          }
          if (mDegree[e.mNext.mInverse.mNext.mNext.mEnd] != 4) {
            continue;
          }
          goodOr[nor++] = e;
          goodMir[nmir++] = e.mInverse;
          mEdgeFactory.markLo(e);
          ee = e.mInverse.mPrev.mPrev.mPrev;
          goodOr[nor++] = ee;
          goodMir[nmir++] = ee.mInverse;
          mEdgeFactory.markLo(ee);
          ee = ee.mInverse.mPrev.mPrev.mPrev;
          goodOr[nor++] = ee;
          goodMir[nmir++] = ee.mInverse;
          mEdgeFactory.markLo(ee);
        }
      }
    }
    nGoodOr.set(nor);
    nGoodMir.set(nmir);
  }

  private static int fiveType(final int d1, final int d2, final int d3) {
    return (d1 << 21) + (d2 << 11) + d3;
  }

  /* The five-operation with reference edge *ref has just been performed.
     Make a list in goodOr[0..*ngoodOr-1] of the reference edges of
     legal five-reductions (oriented editions) that might be canonical,
     with the first *ngoodRef of those being ref.
     Make a list in goodMir[0..*ngoodMir-1] of the
     reference edges of legal five-reductions (mirror-image editions)
     that might be canonical, with the first *ngoodMirRef of those being
     ref.
     *ngoodRef and *ngoodMirRef might each be 0 or 1.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).
  */
  private void min4FiveLegal(final Edge ref, final Edge[] goodOr, final MutableInteger ngoodOr, final MutableInteger ngoodRef,
                             final Edge[] goodMir, final MutableInteger ngoodMir, final MutableInteger ngoodMirRef) {
    Edge e = ref;
    final int bestdeg = mDegree[e.mEnd];
    int deg2 = mDegree[e.mPrev.mEnd];
    int deg3 = mDegree[e.mNext.mEnd];
    int type1 = fiveType(bestdeg, deg2, deg3);
    int type2 = fiveType(bestdeg, deg3, deg2);
    final int besttype = type1 > type2 ? type1 : type2;

    int nor = 0;
    int nmir = 0;
    if (type1 == besttype) {
      goodOr[nor++] = e;
    }
    if (type2 == besttype) {
      goodMir[nmir++] = e;
    }
    ngoodRef.set(nor);
    ngoodMirRef.set(nmir);

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 5) {
        int j;
        for (e = mFirstEdge[i], j = 0; j < 5; ++j, e = e.mNext) {
          if (e == ref) {
            continue;
          }
          final int deg1 = mDegree[e.mEnd];
          if (deg1 < bestdeg) {
            continue;
          }
          deg2 = mDegree[e.mPrev.mEnd];
          if (deg2 == 4) {
            continue;
          }
          deg3 = mDegree[e.mNext.mEnd];
          if (deg3 == 4) {
            continue;
          }
          final int v = e.mNext.mNext.mEnd;
          final int w = e.mNext.mNext.mNext.mEnd;
          Edge ez = e.mInverse;
          final Edge ezlast = ez.mPrev;
          for (ez = ez.mNext.mNext; ez != ezlast; ez = ez.mNext) {
            if (ez.mEnd == w || ez.mEnd == v) {
              break;
            }
          }
          if (ez != ezlast) {
            continue;
          }
          if (deg1 > bestdeg) {
            ngoodRef.set(0);
            ngoodMirRef.set(0);
            return;
          }

          type1 = fiveType(deg1, deg2, deg3);
          type2 = fiveType(deg1, deg3, deg2);
          if (type1 > besttype || type2 > besttype) {
            ngoodRef.set(0);
            ngoodMirRef.set(0);
            return;
          }
          if (type1 == besttype) {
            goodOr[nor++] = e;
          }
          if (type2 == besttype) {
            goodMir[nmir++] = e;
          }
        }
      }
    }
    ngoodOr.set(nor);
    ngoodMir.set(nmir);
  }

  /* The main node of the recursion for triangulations with minimum
       degree at least 4.  This is the version keeping track of all the
       non-facial triangles.
       As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
       and nbtot/nbop are the values returned by canon() for that graph.
       If doSplit==true, this is the place to do splitting (if any).
       Splitting is a bit more complicated because the S operation adds
       three vertices.
       If this graph was made with a four-operation, the reference edge of
       that operation is lastFour.  If not, lastFour=null.
       nft[0..numnft-1] is a list of all the non-facial triangles.
       Edges in the triangles must be in mMin form.
    */
  void scanMin4C(final int nbtot, final int nbop, final boolean doSplit, final Edge lastFour, final Triangle[] nft, final int numnft) {
    final Edge[] firstEdgeSave = new Edge[Plantri.MAX_VERTICES];
    final Edge[] ext4 = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext5 = new Edge[Plantri.MAX_EDGES];
    final Edge[] extS = new Edge[Plantri.MAX_FACES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];

    if (mState.mNumVertices == mMaxNV) {
      mPlantri.gotOne(nbtot, nbop, 3 + (numnft == 0 ? 1 : 0));
      return;
    }
    if (doSplit) {
      if (updateSplitCount()) {
        return;
      }
      mPlantri.setSplitCount(mPlantri.mMod - 1);
      System.arraycopy(mFirstEdge, 0, firstEdgeSave, 0, mState.mNumVertices);
    }

    final MutableInteger next4 = new MutableInteger();
    final MutableInteger next5 = new MutableInteger();
    final MutableInteger nextS = new MutableInteger();
    findExtensionsMin4(nbtot, nbop, ext4, next4, ext5, next5, extS, nextS, lastFour);
    if (mState.mNumVertices == mMaxNV - 1 && numnft > 0 && mMinConnec == 4) {
      nftLastStep(ext4, next4, ext5, next5, nft, numnft);
    }

    final MutableInteger ngoodOr = new MutableInteger();
    final MutableInteger ngoodRef = new MutableInteger();
    final MutableInteger ngoodMir = new MutableInteger();
    final MutableInteger ngoodMirRef = new MutableInteger();
    final MutableInteger xnbtot = new MutableInteger();
    final MutableInteger xnbop = new MutableInteger();
    final Triangle[] newnft = new Triangle[Plantri.MAX_VERTICES];
    for (int i = 0; i < next4.get(); ++i) {
      mBatagelj4.extend(ext4[i]);
      min4FourLegal(ext4[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
      if (ngoodRef.get() + ngoodMirRef.get() > 0) {
        if (mState.mNumVertices == mMaxNV && !mNeedGroup && ngoodOr.get() == ngoodRef.get() && ngoodMir.get() == ngoodMirRef.get()) {
          final int newnumnft = updateNftFour(nft, numnft, ext4[i], newnft);
          mPlantri.gotOne(1, 1, 3 + (newnumnft == 0 ? 1 : 0));
        } else if (ngoodOr.get() + ngoodMir.get() == 1) {
          final int newnumnft = updateNftFour(nft, numnft, ext4[i], newnft);
          scanMin4C(1, 1, mState.mNumVertices == mPlantri.mSplitLevel, ext4[i], newnft, newnumnft);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), mDegree, mNumbering, xnbtot, xnbop)) {
          final int newnumnft = updateNftFour(nft, numnft, ext4[i], newnft);
          scanMin4C(xnbtot.get(), xnbop.get(), mState.mNumVertices == mPlantri.mSplitLevel, ext4[i], newnft, newnumnft);
        }
      }
      mBatagelj4.reduce(ext4[i]);
    }

    int hint = -1;
    for (int i = 0; i < next5.get(); ++i) {
      mBatagelj5.extend(ext5[i]);
      if (hint < 0 || !isMin4FourCentre(hint)) {
        hint = min4FourCentre();
      }
      if (hint < 0) {
        min4FiveLegal(ext5[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
        if (ngoodRef.get() + ngoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), mDegree, mNumbering, xnbtot, xnbop)) {
            final int newnumnft = updateNftFive(nft, numnft, ext5[i], newnft);
            scanMin4C(xnbtot.get(), xnbop.get(), mState.mNumVertices == mPlantri.mSplitLevel, null, newnft, newnumnft);
          }
        }
      }
      mBatagelj5.reduce(ext5[i]);
    }

    for (int i = 0; i < nextS.get(); ++i) {
      mBatageljS.extend(extS[i]);
      if (degree5Vertex() < 0 && min4FourCentre() < 0) {
        min4SLegal(extS[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
        if (ngoodRef.get() + ngoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), ZERO, mNumbering, xnbtot, xnbop)) {
            Edge e = extS[i];
            nft[numnft] = new Triangle();
            nft[numnft].mEdge1 = e.mMin;
            e = e.mInverse.mPrev.mPrev.mPrev;
            nft[numnft].mEdge2 = e.mMin;
            e = e.mInverse.mPrev.mPrev.mPrev;
            nft[numnft].mEdge3 = e.mMin;
            scanMin4C(xnbtot.get(), xnbop.get(), mState.mNumVertices >= mPlantri.mSplitLevel && mState.mNumVertices <= mPlantri.mSplitLevel + 2, null, nft, numnft + 1);
          }
        }
      }
      mBatageljS.reduce(extS[i]);
    }
    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

  private boolean updateSplitCount() {
    final int v = mPlantri.mSplitCount;
    mPlantri.setSplitCount(v - 1);
    return v != 0;
  }

  /* The main node of the recursion for triangulations with minimum
     degree at least 4.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbtot/nbop are the values returned by canon() for that graph.
     If doSplit==true, this is the place to do splitting (if any).
     Splitting is a bit more complicated because the S operation adds
     three vertices.
     If this graph was made with a four-operation, the reference edge of
     that operation is lastFour.  If not, lastFour=null.
  */
  void scanMin4(final int nbtot, final int nbop, final boolean doSplit, final Edge lastFour) {
    if (mState.mNumVertices == mMaxNV) {
      if (mPSwitch) {
        mPlantri.startPolyScan(nbtot, nbop, mNeedGroup);
      } else {
        mPlantri.gotOne(nbtot, nbop, 3);
      }
      return;
    }
    final Edge[] firstEdgeSave = new Edge[Plantri.MAX_VERTICES];
    if (doSplit) {
      if (updateSplitCount()) {
        return;
      }
      mPlantri.setSplitCount(mPlantri.mMod - 1);
      System.arraycopy(mFirstEdge, 0, firstEdgeSave, 0, mState.mNumVertices);
    }

    final Edge[] ext4 = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext5 = new Edge[Plantri.MAX_EDGES];
    final Edge[] extS = new Edge[Plantri.MAX_FACES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final MutableInteger next4 = new MutableInteger();
    final MutableInteger next5 = new MutableInteger();
    final MutableInteger nextS = new MutableInteger();
    findExtensionsMin4(nbtot, nbop, ext4, next4, ext5, next5, extS, nextS, lastFour);

    final MutableInteger ngoodOr = new MutableInteger();
    final MutableInteger ngoodRef = new MutableInteger();
    final MutableInteger ngoodMir = new MutableInteger();
    final MutableInteger ngoodMirRef = new MutableInteger();
    final MutableInteger xnbtot = new MutableInteger();
    final MutableInteger xnbop = new MutableInteger();
    for (int i = 0; i < next4.get(); ++i) {
      mBatagelj4.extend(ext4[i]);
      min4FourLegal(ext4[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
      if (ngoodRef.get() + ngoodMirRef.get() > 0) {
        if (mState.mNumVertices == mMaxNV && !mNeedGroup && ngoodOr.get() == ngoodRef.get() && ngoodMir.get() == ngoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 3);
        } else if (ngoodOr.get() + ngoodMir.get() == 1) {
          scanMin4(1, 1, mState.mNumVertices == mPlantri.mSplitLevel, ext4[i]);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), mDegree, mNumbering, xnbtot, xnbop)) {
          scanMin4(xnbtot.get(), xnbop.get(), mState.mNumVertices == mPlantri.mSplitLevel, ext4[i]);
        }
      }
      mBatagelj4.reduce(ext4[i]);
    }

    // hint = lastFour ? lastFour.mStart : -1;
    int hint = -1;
    for (int i = 0; i < next5.get(); ++i) {
      mBatagelj5.extend(ext5[i]);
      if (hint < 0 || !isMin4FourCentre(hint)) {
        hint = min4FourCentre();
      }
      if (hint < 0) {
        min4FiveLegal(ext5[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
        if (ngoodRef.get() + ngoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), mDegree, mNumbering, xnbtot, xnbop)) {
            scanMin4(xnbtot.get(), xnbop.get(), mState.mNumVertices == mPlantri.mSplitLevel, null);
          }
        }
      }
      mBatagelj5.reduce(ext5[i]);
    }

    for (int i = 0; i < nextS.get(); ++i) {
      mBatageljS.extend(extS[i]);
      if (degree5Vertex() < 0 && min4FourCentre() < 0) {
        min4SLegal(extS[i], goodOr, ngoodOr, ngoodRef, goodMir, ngoodMir, ngoodMirRef);
        if (ngoodRef.get() + ngoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ngoodRef.get(), goodMir, ngoodMir.get(), ngoodMirRef.get(), ZERO, mNumbering, xnbtot, xnbop)) {
            scanMin4(xnbtot.get(), xnbop.get(), mState.mNumVertices >= mPlantri.mSplitLevel && mState.mNumVertices <= mPlantri.mSplitLevel + 2, null);
          }
        }
      }
      mBatageljS.reduce(extS[i]);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }
}
