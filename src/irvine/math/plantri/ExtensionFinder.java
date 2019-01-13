package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class ExtensionFinder {

  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final EdgeFactory mEdgeFactory;

  ExtensionFinder(final PlantriGraphState state, final Numbering numbering, final EdgeFactory edgeFactory) {
    mState = state;
    mDegree = state.mDegree;
    mEdges = state.mEdges;
    mFirstEdge = state.mFirstEdge;
    mNumbering = numbering;
    mEdgeFactory = edgeFactory;
  }

  /* Find all nonequivalent places for extension.
     These are listed in ext# according to the degree of the future new vertex.
     The number of cases is returned in mNext# (#=3,4,5). */
  void findExtensions(final int numbTotal, final int numbPres,
                             final Edge[] ext3, final MutableInteger numext3,
                             final Edge[] ext4, final MutableInteger numext4,
                             final Edge[] ext5, final MutableInteger numext5) {
    int deg3 = 0;
    int deg4 = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 3) {
        ++deg3;
      } else if (mDegree[i] == 4) {
        ++deg4;
      }
    }

    // code for trivial group
    if (numbTotal == 1) {
      int k = 0;
      for (int i = 0; i < mState.mNumVertices; ++i) {
        Edge e = mFirstEdge[i];
        final Edge ex = e;
        do {
          Edge e1 = e.mInverse.mPrev;
          if (e1.mAlloc > e.mAlloc) {
            e1 = e1.mInverse.mPrev;
            if (e1.mAlloc > e.mAlloc) {
              ext3[k++] = e;
            }
          }
          e = e.mNext;
        } while (e != ex);
      }
      numext3.set(k);

      if (deg3 <= 2) {
        k = 0;
        for (int i = 0; i < mState.mNumVertices; ++i) {
          if (mDegree[i] == 3) {
            continue;
          }
          Edge e = mFirstEdge[i];
          final Edge ex = e;
          do {
            final Edge e1 = e.mNext;
            if (e1.mInverse.mAlloc > e1.mAlloc) {
              final Edge e2 = e1.mInverse.mPrev;
              if (((mDegree[e.mEnd] == 3) ? 1 : 0) + ((mDegree[e2.mEnd] == 3) ? 1 : 0) == deg3) {
                ext4[k++] = e;
              }
            }
            e = e.mNext;
          } while (e != ex);
        }
        numext4.set(k);
      } else {
        numext4.set(0);
      }
      if (deg3 == 0 && deg4 <= 2) {
        k = 0;
        for (int i = 0; i < mState.mNumVertices; ++i) {
          if (mDegree[i] < 6) {
            continue;
          }
          Edge e = mFirstEdge[i];
          final Edge ex = e;
          do {
            final Edge e1 = e.mNext.mNext.mNext;
            if (((mDegree[e.mEnd] == 4) ? 1 : 0) + ((mDegree[e1.mEnd] == 4) ? 1 : 0) == deg4) {
              ext5[k++] = e;
            }
            e = e.mNext;
          } while (e != ex);
        }
        numext5.set(k);
      } else {
        numext5.set(0);
      }
    } else {
      // Nontrivial group
      final int nbOp = numbPres == 0 ? numbTotal : numbPres;

      mNumbering.resetToIdentity(mState.mNumEdges);

      mEdgeFactory.resetMarks(mEdges);

      int k = 0;
      for (int i = 0; i < mState.mNumEdges; ++i) {
        final Edge e = mNumbering.get(0, i);
        if (mEdgeFactory.isMarkedLo(e)) {
          continue;
        }
        ext3[k++] = e;
        mNumbering.inverseMarkLo(mNumbering.markLo(0, nbOp, i), numbTotal, i);
        final Edge e1 = e.mInverse.mPrev;
        mNumbering.inverseMarkLo(mNumbering.markLo(0, nbOp, e1.mIndex), numbTotal, e1.mIndex);
        final Edge e2 = e1.mInverse.mPrev;
        mNumbering.inverseMarkLo(mNumbering.markLo(0, nbOp, e2.mIndex), numbTotal, e2.mIndex);
      }
      numext3.set(k);

      if (deg3 <= 2) {
        mEdgeFactory.resetMarks(mEdges);
        k = 0;
        for (int i = 0; i < mState.mNumEdges; ++i) {
          final Edge e = mNumbering.get(0, i);
          if (mEdgeFactory.isMarkedLo(e)) {
            continue;
          }
          final Edge e1 = e.mNext.mInverse.mPrev;
          if (((mDegree[e.mEnd] == 3) ? 1 : 0) + ((mDegree[e1.mEnd] == 3) ? 1 : 0) != deg3) {
            continue;
          }
          ext4[k++] = e;
          mNumbering.prevPrevMarkLo(mNumbering.markLo(0, nbOp, i), numbTotal, i);
          mNumbering.prevPrevMarkLo(mNumbering.markLo(0, nbOp, e1.mIndex), numbTotal, e1.mIndex);
        }
        numext4.set(k);
      } else {
        numext4.set(0);
      }

      if (deg3 == 0 && deg4 <= 2) {
        mEdgeFactory.resetMarks(mEdges);
        k = 0;
        for (int i = 0; i < mState.mNumEdges; ++i) {
          final Edge e = mNumbering.get(0, i);
          if (mEdgeFactory.isMarkedLo(e) || mDegree[e.mStart] < 6) {
            continue;
          }

          if (((mDegree[e.mEnd] == 4) ? 1 : 0) + ((mDegree[e.mNext.mNext.mNext.mEnd] == 4) ? 1 : 0) != deg4) {
            continue;
          }
          ext5[k++] = e;
          mNumbering.prevPrevPrevMarkLo(mNumbering.markLo(0, nbOp, i), numbTotal, i);
        }
        numext5.set(k);
      } else {
        numext5.set(0);
      }
    }
  }

}
