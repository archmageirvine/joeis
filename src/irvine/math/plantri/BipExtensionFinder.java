package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class BipExtensionFinder {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;

  BipExtensionFinder(final Plantri plantri, final Numbering numbering) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
    mEdges = mState.mEdges;
    mNumbering = numbering;
  }

  /* Return true if e is the reference edge of a valid P reduction,
     otherwise false.  It must be that e is an edge of the graph. */
  boolean isBipP(final Edge e) {
    if (mDegree[e.mStart] != 4 || mDegree[e.mEnd] == 4) {
      return false;
    }
    if (mDegree[e.mNext.mEnd] == 4 || mDegree[e.mPrev.mEnd] == 4) {
      return false;
    }
    final Edge e1 = e.mNext.mNext;
    if (mDegree[e1.mEnd] != 4) {
      return false;
    }
    final int z = e1.mInverse.mNext.mNext.mEnd;
    if (mDegree[z] == 4) {
      return true;
    }
    Edge ew = e.mInverse;
    final Edge ewlast = ew.mPrev;
    for (ew = ew.mNext.mNext; ew != ewlast; ew = ew.mNext) {
      if (ew.mEnd == z) {
        break;
      }
    }
    return ew == ewlast;
  }

  private static Edge getLastEdge(final int w, final Edge evlast) {
    Edge ev = evlast;
    for (ev = ev.mNext; ev != evlast; ev = ev.mNext) {
      if (ev.mEnd == w) {
        break;
      }
    }
    return ev;
  }

  /* nbTot and nbOp are the usual group parameters.
     Place in extP{0..nextP-1] the reference edges of possible P_ops, and
     place in extQ{0..nextQ-1] the reference edges of possible Q_ops.
     In both cases, only inequivalent edges are listed.
  */
  void findExtensions(final int nbTot, final int nbOp, final Edge[] extP, final MutableInteger nextP, final Edge[] extQ, final MutableInteger nextQ, final Edge[] pEdges, final int nPedges) {
    final int[] weight = new int[Plantri.MAX_VERTICES];
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    int minWeight = 0;
    ef.resetMarks(mEdges);
    for (int i = 0; i < nPedges; ++i) {
      if (i == nPedges - 1 || isBipP(pEdges[i])) {
        Edge e = pEdges[i];
        if (ef.isMarkedLo(e)) {
          continue;
        }
        ef.markLo(e);
        weight[e.mStart]++;
        e = e.mNext.mNext.mInverse.mNext.mNext;
        weight[e.mStart]++;
        weight[e.mEnd]++;
        while (mDegree[e.mEnd] == 4) {
          e = e.mInverse.mNext.mNext;
        }
        ef.markLo(e);
        weight[e.mStart]++;
        e = e.mPrev.mPrev.mInverse.mPrev.mPrev;
        weight[e.mStart]++;
        weight[e.mEnd]++;
        minWeight += 2;
      }
    }

    if (mState.mNumVertices == mPlantri.mMaxNV - 1) {
      if (nbTot == 1) {
        // Case of trivial group
        nextQ.set(findQExtensionsBipTrivial(extQ, weight, minWeight));
      } else {
        // Case of nontrivial group
        nextQ.set(findQExtensionsBipNontrivial(nbTot, nbOp, extQ, weight, minWeight));
      }
    } else {
      //assert mState.mNumVertices <= mMaxNV - 2;
      final int oldPwt;
      final int pv1;
      final int pv2;
      if (nPedges > 0) {
        final Edge e = pEdges[nPedges - 1];
        oldPwt = mDegree[e.mEnd];
        pv1 = e.mStart;
        pv2 = e.mNext.mNext.mEnd;
      } else {
        oldPwt = 0;
        pv1 = 0;
        pv2 = 0;
      }

      if (nbTot == 1) {
        // Case of trivial group
        nextP.set(findPExtensionsBipTrivial(extP, extQ, nextQ, weight, minWeight, oldPwt, pv1, pv2));
      } else {
        // Case of nontrivial group
        nextP.set(findPExtensionsBipNontrivial(nbTot, nbOp, extP, extQ, nextQ, weight, minWeight, oldPwt, pv1, pv2));
      }
    }
  }

  private int findPExtensionsBipNontrivial(final int nbTot, final int nbOp, final Edge[] extP, final Edge[] extQ, final MutableInteger nextQ, final int[] weight, final int minWeight, final int oldPwt, final int pv1, final int pv2) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    int pTot = 0;
    ef.resetMarks(mEdges);
    for (int i = 0; i < mState.mNumEdges; ++i) {
      if (!ef.isMarkedLo(mNumbering.get(0, i)) && mDegree[mNumbering.get(0, i).mStart] >= 6) {
        final Edge e = mNumbering.get(0, i);
        if (mDegree[e.mStart] >= oldPwt || e.mNext.mEnd == pv1 || e.mNext.mEnd == pv2 || e.mPrev.mEnd == pv1 || e.mPrev.mEnd == pv2) {
          Edge ee;
          for (ee = e; mDegree[ee.mEnd] == 4; ee = ee.mInverse.mNext.mNext) {
          }
          if (mDegree[e.mStart] >= mDegree[ee.mEnd]) {
            extP[pTot++] = e.mInverse;
          }
        }
        mNumbering.markLo(0, nbTot, i);
      }
    }

    final int nbOplim = nbOp == 0 ? nbTot : nbOp;
    ef.resetMarks(mEdges);
    for (int i = 0; i < mState.mNumEdges; ++i) {
      final Edge e = mNumbering.get(0, i);
      if (mDegree[e.mStart] >= 6 && !ef.isMarkedLo(e)) {
        final int v = e.mPrev.mEnd;
        final int w = e.mNext.mNext.mEnd;
        if (weight[v] + weight[w] >= minWeight) {
          final Edge evLast = e.mPrev.mInverse;
          Edge ev = evLast;
          for (ev = ev.mNext; ev != evLast; ev = ev.mNext) {
            if (ev.mEnd == w) {
              break;
            }
          }
          if (ev == evLast) {
            extQ[nextQ.postIncrement()] = e;
          }
        }
        mNumbering.prevMarkLo(mNumbering.markLo(1, nbOplim, i), nbTot, i);
      }
    }
    return pTot;
  }

  private int findPExtensionsBipTrivial(final Edge[] extP, final Edge[] extQ, final MutableInteger nextQ, final int[] weight, final int minWeight, final int oldPwt, final int pv1, final int pv2) {
    int pTot = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] != 4) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          if (mDegree[i] >= oldPwt || e.mNext.mEnd == pv1 || e.mNext.mEnd == pv2 || e.mPrev.mEnd == pv1 || e.mPrev.mEnd == pv2) {
            Edge ee;
            for (ee = e; mDegree[ee.mEnd] == 4; ee = ee.mInverse.mNext.mNext) {
            }
            if (mDegree[i] >= mDegree[ee.mEnd]) {
              extP[pTot++] = e.mInverse;
            }
          }

          final int v = e.mPrev.mEnd;
          final int w = e.mNext.mNext.mEnd;
          if (weight[v] + weight[w] >= minWeight) {
            final Edge evlast = e.mPrev.mInverse;
            Edge ev = evlast;
            for (ev = ev.mNext; ev != evlast; ev = ev.mNext) {
              if (ev.mEnd == w) {
                break;
              }
            }
            if (ev == evlast) {
              extQ[nextQ.postIncrement()] = e;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }
    return pTot;
  }

  private int findQExtensionsBipNontrivial(final int nbTot, final int nbOp, final Edge[] extQ, final int[] weight, final int minWeight) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    final int nbOplim = nbOp == 0 ? nbTot : nbOp;
    ef.resetMarks(mEdges);
    int qTot = 0;
    for (int i = 0; i < mState.mNumEdges; ++i) {
      final Edge e = mNumbering.get(0, i);
      if (mDegree[e.mStart] >= 6 && !ef.isMarkedLo(e)) {
        final int v = e.mPrev.mEnd;
        final int w = e.mNext.mNext.mEnd;

        if (weight[v] + weight[w] >= minWeight) {
          final Edge evlast = e.mPrev.mInverse;
          final Edge ev = getLastEdge(w, evlast);
          if (ev == evlast) {
            extQ[qTot++] = e;
          }
        }
        mNumbering.prevMarkLo(mNumbering.markLo(1, nbOplim, i), nbTot, i);
      }
    }
    return qTot;
  }

  private int findQExtensionsBipTrivial(final Edge[] extQ, final int[] weight, final int minWeight) {
    int qTot = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] != 4) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          final int v = e.mPrev.mEnd;
          final int w = e.mNext.mNext.mEnd;
          if (weight[v] + weight[w] >= minWeight) {
            final Edge evlast = e.mPrev.mInverse;
            final Edge ev = getLastEdge(w, evlast);
            if (ev == evlast) {
              extQ[qTot++] = e;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }
    return qTot;
  }

}
