package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The recursive search procedure for polytopes.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class PolytopeC3Scanner extends PolytopeScanner {

  PolytopeC3Scanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final int[] edgeBounds, final int maxFaceSize, final boolean needGroup) {
    super(plantri, numbering, vertexMarks, edgeBounds, maxFaceSize);
  }

  private int degEndC3(final Edge ed) {
    return mDegree[ed.mEnd];
  }

  private int orcolc3(final Edge ed) {
    return (mDegree[ed.mInverse.mPrev.mEnd] << 10) + ed.mLeftFaceSize;
  }

  private int invcolc3(final Edge ed) {
    return (mDegree[ed.mInverse.mNext.mEnd] << 10) + ed.mInverse.mLeftFaceSize;
  }

  /* Assumes there is a 3-face on the left of eDel, and that eDel can
     be deleted while keeping degrees >= 3.  Also, the new face created will
     be a largest face.  oldmaxface is the size of the largest face so far,
     and mInMaxFace[oldmaxlist0..oldmaxlist1-1] are the edges with a face of
     maximum size on the left.

     This procedure deletes eDel provided the result is 3-connected, and that
     the procedure believes the re-insertion of eDel might be a canonical
     edge insertion.  The latter decision is based on four combinatorial
     invariants: the three vertex degrees at the ends of eDel and on its left,
     and the size of the face to the left of eDel.mPrev.

     In case eDel passes the test and is deleted, the edges which may
     represent the re-insertion of eDel and optimise the four-part invariant
     mentioned above are put in goodOr[0..*nCanOr-1] and
     goodInv[0..nCanInv-1].  This will include at least one of the edges
     eDel.mPrev, eDel.mInverse.mNext and (if there is also a 3-face on the
     right of eDel) eDel.mNext and eDel.mInverse.mPrev.  Then all other edges
     which might possibly represent canonical edge insertions are put in
     goodOr[nCanOr..nGoodOr-1] or goodInv[nCanInv..nGoodInv-1].
     The *Or edges are those for which the inserted edge will be in the
     mNext direction, and the *Inv edges .. the mPrev direction.

     In addition, if eDel is deleted, mInMaxFace[newmaxlist0..newmaxlist1-1]
     will have all edges with a maximum face on the left (that size being put
     into newmaxface).  This list may overlap
     mInMaxFace[oldmaxlist0..oldmaxlist1-1] if the max face size does not
     increase.

     Return values:   0 = ok
                      1 = rejected by threeConn()
                      2 = rejected by colour

     This version is for 3-connected only!  maybeDelete() is the more
     general version that works for connectivity 1 or more.
    */
  private int maybeDeleteC3(Edge eDel, final int oldMaxFace, int oldMaxList0, final int oldMaxList1,
                            final MutableInteger newMaxFace, final MutableInteger newMaxList0, final MutableInteger newMaxList1,
                            final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nCanOr,
                            final Edge[] goodInv, final MutableInteger nGoodInv, final MutableInteger nCanInv) {

    final int maxFace = eDel.mInverse.mLeftFaceSize + 1;
    newMaxFace.set(maxFace);
    if (maxFace > oldMaxFace) {
      oldMaxList0 = oldMaxList1;
    }
    newMaxList0.set(oldMaxList0);

    nGoodOr.set(0);
    nGoodInv.set(0);

    // Now old edges that will be on a largest face (if eDel is deleted)
    // are in places oldMaxList0..oldMaxList1-1.  New edges will be from
    // oldMaxList1 to newMaxList1-1, but newMaxList1 is not set yet.
    final int v1 = eDel.mStart;
    final int v2 = eDel.mEnd;
    final int maxDeg = (mDegree[v1] > mDegree[v2] ? mDegree[v1] : mDegree[v2]) - 1;

    final Edge e1 = eDel.mPrev;
    final int v3 = e1.mEnd;
    final Edge e4 = eDel.mNext;
    final int v4 = e4.mEnd;

    if (mDegree[v3] > maxDeg || mDegree[v4] > maxDeg) {
      return 2;
    }

    reduceDegree(v1, v2);
    final Edge e2 = eDel.mInverse.mNext;
    final Edge e3 = eDel.mInverse.mPrev;

    long maxCol = 0;
    int ncOr = 0;
    int ncInv = 0;
    if (mDegree[v1] == maxDeg) {
      long col = degEndC3(e1);
      maxCol = col;
      goodOr[ncOr++] = e1;
      if (maxFace == 4) {
        col = degEndC3(e4);
        if (col > maxCol) {
          ncOr = ncInv = 0;
          goodInv[ncInv++] = e4;
          maxCol = col;
        } else if (col == maxCol) {
          goodInv[ncInv++] = e4;
        }
      }
    }

    if (mDegree[v2] == maxDeg) {
      long col = degEndC3(e2);
      if (col > maxCol) {
        ncOr = ncInv = 0;
        goodInv[ncInv++] = e2;
        maxCol = col;
      } else if (col == maxCol) {
        goodInv[ncInv++] = e2;
      }
      if (maxFace == 4) {
        col = degEndC3(e3);
        if (col > maxCol) {
          ncOr = ncInv = 0;
          goodOr[ncOr++] = e3;
          maxCol = col;
        } else if (col == maxCol) {
          goodOr[ncOr++] = e3;
        }
      }
    }

    int ngOr = ncOr;
    int ngInv = ncInv;

    if (maxFace > 4) {
      if (mDegree[v2] == maxDeg) {
        final long col = degEndC3(e3);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodOr[ngOr++] = e3;
        }
      }
      if (mDegree[v1] == maxDeg) {
        final long col = degEndC3(e4);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodInv[ngInv++] = e4;
        }
      }
    }

    if (mDegree[v3] == maxDeg) {
      long col = degEndC3(e2.mInverse);
      if (col > maxCol) {
        increaseDegree(v1, v2);
        return 2;
      } else if (col == maxCol) {
        goodOr[ngOr++] = e2.mInverse;
      }
      col = degEndC3(e1.mInverse);
      if (col > maxCol) {
        increaseDegree(v1, v2);
        return 2;
      } else if (col == maxCol) {
        goodInv[ngInv++] = e1.mInverse;
      }
    }

    int nml1 = oldMaxList1;
    int v = e3.mEnd;
    Edge ee = e3.mInverse;
    while (true) {
      mInMaxFace[nml1++] = ee;
      if (mDegree[v] > maxDeg) {
        increaseDegree(v1, v2);
        return 2;
      } else if (mDegree[v] == maxDeg) {
        long col = degEndC3(ee);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodInv[ngInv++] = ee;
        }
        ee = ee.mPrev;
        col = degEndC3(ee);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodOr[ngOr++] = ee;
        }
      } else {
        ee = ee.mPrev;
      }

      if (v == v4) {
        break;
      }

      v = ee.mEnd;
      ee = ee.mInverse;
    }

    mInMaxFace[nml1++] = e2;
    mInMaxFace[nml1++] = e1.mInverse;
    mInMaxFace[nml1++] = e4;

    // Now test old edges still on max faces
    for (int i = oldMaxList0; i < oldMaxList1; ++i) {
      ee = mInMaxFace[i];
      if (mDegree[ee.mStart] > maxDeg) {
        increaseDegree(v1, v2);
        return 2;
      } else if (mDegree[ee.mStart] == maxDeg) {
        long col = degEndC3(ee);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodInv[ngInv++] = ee;
        }
        ee = ee.mPrev;
        col = degEndC3(ee);
        if (col > maxCol) {
          increaseDegree(v1, v2);
          return 2;
        } else if (col == maxCol) {
          goodOr[ngOr++] = ee;
        }
      }
    }

    if (!eDel.threeConn(this)) {
      increaseDegree(v1, v2);
      return 1;
    }

    // Now we have complete success!  Delete eDel!
    newMaxList1.set(nml1);
    nGoodOr.set(ngOr);
    nGoodInv.set(ngInv);
    nCanOr.set(ncOr);
    nCanInv.set(ncInv);

    for (int i = oldMaxList1; i < nml1; ++i) {
      mInMaxFace[i].mLeftFaceSize = maxFace;
    }

    eDel.mPrev.mNext = eDel.mNext;
    eDel.mNext.mPrev = eDel.mPrev;
    eDel = eDel.mInverse;
    eDel.mPrev.mNext = eDel.mNext;
    eDel.mNext.mPrev = eDel.mPrev;
    mFirstEdge[v1] = e1;
    mFirstEdge[v2] = e2;
    mState.mNumEdges -= 2;

    if (ngOr + ngInv == 1) {
      return 0;
    }

    maxCol = 0;
    for (int i = 0; i < ncOr; ++i) {
      if (orcolc3(goodOr[i]) > maxCol) {
        maxCol = orcolc3(goodOr[i]);
      }
    }
    for (int i = 0; i < ncInv; ++i) {
      if (invcolc3(goodInv[i]) > maxCol) {
        maxCol = invcolc3(goodInv[i]);
      }
    }

    int i, k;
    for (i = 0, k = 0; i < ncOr; ++i) {
      if (orcolc3(goodOr[i]) == maxCol) {
        goodOr[k++] = goodOr[i];
      }
    }
    nCanOr.set(k);
    for (; i < ngOr; ++i) {
      final long col = orcolc3(goodOr[i]);
      if (col == maxCol) {
        goodOr[k++] = goodOr[i];
      } else if (col > maxCol) {
        insertEdgeTri(eDel.mInverse);
        nGoodOr.set(0);
        nGoodInv.set(0);
        return 2;
      }
    }
    nGoodOr.set(k);

    for (i = 0, k = 0; i < ncInv; ++i) {
      if (invcolc3(goodInv[i]) == maxCol) {
        goodInv[k++] = goodInv[i];
      }
    }
    nCanInv.set(k);
    for (; i < ngInv; ++i) {
      final long col = invcolc3(goodInv[i]);
      if (col == maxCol) {
        goodInv[k++] = goodInv[i];
      } else if (col > maxCol) {
        insertEdgeTri(eDel.mInverse);
        nGoodOr.set(0);
        nGoodInv.set(0);
        return 2;
      }
    }
    nGoodInv.set(k);
    return 0;
  }

  /* This is the recursive search procedure for polytopes.
     oldfeas[0..noldfeas-1] are the edges which can be removed
     without violating connectivity.  nbtot/nbop represent the
     group, as usual.   oldMaxFace is the size of the largest face.
     mInMaxFace[oldMaxList0..oldMaxList1-1] lists the edges whose
     left face has greatest size (unless that is 3).
  
     This version is for 3-connected only!  scan() is the more
     general version that works for connectivity 1 or more.
    */
  void scan(final int nbtot, final int nbop, final Edge[] oldfeas, int noldfeas,
            final int oldMaxFace, final int oldMaxList0, final int oldMaxList1) {
    final Edge[] newfeas = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodInv = new Edge[Plantri.MAX_EDGES];
    final int[] minimal = new int[Plantri.MAX_EDGES / 2];

    if (mState.mNumEdges <= mEdgeBounds[1]) {
      mPlantri.gotOne(nbtot, nbop, 3);
    }
    if (mState.mNumEdges == mEdgeBounds[0]) {
      return;
    }
    if (mState.mNumEdges - 2 * noldfeas > mEdgeBounds[1]) {
      return;
    }

    mPlantri.markEdgeOrbits(oldfeas, noldfeas, minimal, nbtot);

    for (int i = 0; i < noldfeas; ++i) {
      if (minimal[i] == 0) {
        continue;
      }

      Edge e = oldfeas[i];
      if (e.mLeftFaceSize != 3) {
        e = e.mInverse;
      }
      if (e.mInverse.mLeftFaceSize < oldMaxFace - 1 || e.mInverse.mLeftFaceSize == mMaxFaceSize) {
        continue;
      }

      final MutableInteger ngoodOr = new MutableInteger();
      final MutableInteger ngoodInv = new MutableInteger();
      final MutableInteger ncanOr = new MutableInteger();
      final MutableInteger ncanInv = new MutableInteger();
      final MutableInteger xnbtot = new MutableInteger();
      final MutableInteger xnbop = new MutableInteger();
      final MutableInteger newmaxface = new MutableInteger();
      final MutableInteger newmaxlist0 = new MutableInteger();
      final MutableInteger newmaxlist1 = new MutableInteger();
      final int code = maybeDeleteC3(e, oldMaxFace, oldMaxList0, oldMaxList1, newmaxface, newmaxlist0, newmaxlist1, goodOr, ngoodOr, ncanOr, goodInv, ngoodInv, ncanInv);

      if (code == 0) {
        if (ngoodOr.get() + ngoodInv.get() == 1) {
          final Edge esave = oldfeas[i];
          oldfeas[i] = oldfeas[noldfeas - 1];
          final int nnewfeas = mPlantri.prunePolyEdgelist(oldfeas, noldfeas - 1, newfeas);
          oldfeas[i] = esave;
          scan(1, 1, newfeas, nnewfeas, newmaxface.get(), newmaxlist0.get(), newmaxlist1.get());
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ncanOr.get(), goodInv, ngoodInv.get(), ncanInv.get(), mDegree, mNumbering, xnbtot, xnbop)) {
          final Edge esave = oldfeas[i];
          oldfeas[i] = oldfeas[noldfeas - 1];
          final int nnewfeas = mPlantri.prunePolyEdgelist(oldfeas, noldfeas - 1, newfeas);
          oldfeas[i] = esave;
          scan(xnbtot.get(), xnbop.get(), newfeas, nnewfeas, newmaxface.get(), newmaxlist0.get(), newmaxlist1.get());
        }
        insertEdgeTri(e);
      } else if (code == 1) {
        oldfeas[i] = oldfeas[--noldfeas];
        minimal[i--] = minimal[noldfeas];
      }
    }
  }
}
