package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class QuadrangulationAllExtensionFinder {

  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final EdgeFactory mEdgeFactory;

  QuadrangulationAllExtensionFinder(final PlantriGraphState state, final Numbering numbering, final EdgeFactory edgeFactory) {
    mState = state;
    mDegree = state.mDegree;
    mEdges = state.mEdges;
    mFirstEdge = state.mFirstEdge;
    mNumbering = numbering;
    mEdgeFactory = edgeFactory;
  }

  private  int vcolp0(final int i, final int j) {
    return mDegree[i] < mDegree[j] ? (mDegree[j] << 10) + mDegree[i] : (mDegree[i] << 10) + mDegree[j];
  }

  /* Determine the inequivalent places to make extensions, for general
     quadrangulations.  The results are put in the arrays
     extP0[0..*nextP0-1] and extP1[0..*nextP1-1].
     nbTot and nbOp are the usual group parameters.
  */
  void findExtensions(final int nbTot, final int nbOp, final Edge[] extP0, final MutableInteger nextP0,
                      final Edge[] extP1, final MutableInteger nextP1) {
    final int x;
    final int y;
    if (mDegree[mState.mNumVertices - 1] == 2) {
      x = mFirstEdge[mState.mNumVertices - 1].mEnd;
      y = mFirstEdge[mState.mNumVertices - 1].mNext.mEnd;
    } else {
      x = -1;
      y = 0;
    }

    int deg2 = 0;
    for (int i = mState.mNumVertices; --i >= 0 && deg2 < 3; ) {
      if (mDegree[i] == 2) {
        ++deg2;
      }
    }

    if (nbTot == 1) {
      // P0 extension for trivial group
      mEdgeFactory.resetMarks(mEdges);
      int k = 0;
      for (int l = 0; l < mState.mNumVertices; ++l) {
        final Edge eLast = mFirstEdge[l];
        Edge e = eLast;
        do {
          if (!mEdgeFactory.isMarkedLo(e)) {
            final int i = e.mEnd;
            final int j = e.mNext.mEnd;
            if (x < 0 || i == mState.mNumVertices - 1 || j == mState.mNumVertices - 1) {
              extP0[k++] = e;
            } else {
              mDegree[i]++;
              mDegree[j]++;
              if (vcolp0(i, j) >= vcolp0(x, y)) {
                extP0[k++] = e;
              }
              mDegree[i]--;
              mDegree[j]--;
            }
            mEdgeFactory.markLo(e.mNext.mInverse.mNext.mInverse);
          }
          e = e.mNext;
        } while (e != eLast);
      }
      nextP0.set(k);

      // P1 extension for trivial group
      if (deg2 > 2) {
        nextP1.set(0);
      } else {
        k = 0;
        for (int i = 0; i < mState.mNumVertices; ++i) {
          if (mDegree[i] >= 4) {
            final Edge eLast = mFirstEdge[i];
            Edge e = eLast;
            do {
              if ((mDegree[e.mPrev.mEnd] == 2 ? 1 : 0) + (mDegree[e.mNext.mEnd] == 2 ? 1 : 0) == deg2) {
                extP1[k++] = e;
              }
              e = e.mNext;
            } while (e != eLast);
          }
        }
        nextP1.set(k);
      }
    } else {
      final int nbOplim = nbOp == 0 ? nbTot : nbOp;
      mNumbering.resetToIdentity(mState.mNumEdges);

      // P0 extensions for non-trivial group
      int k = 0;
      mEdgeFactory.resetMarks(mEdges);
      for (int l = 0; l < mState.mNumEdges; ++l) {
        if (!mEdgeFactory.isMarked(mNumbering.get(0, l))) {
          final Edge e = mNumbering.get(0, l);
          final int i = e.mEnd;
          final int j = e.mNext.mEnd;
          if (x < 0 || i == mState.mNumVertices - 1 || j == mState.mNumVertices - 1) {
            extP0[k++] = e;
          } else {
            mDegree[i]++;
            mDegree[j]++;
            if (vcolp0(i, j) >= vcolp0(x, y)) {
              extP0[k++] = e;
            }
            mDegree[i]--;
            mDegree[j]--;
          }
          mNumbering.inverseNextInverseMarkLo(mNumbering.markLo(1, nbOplim, l), nbTot, l);
          mNumbering.inverseNextInverseMarkLo(mNumbering.markLo(mNumbering.get(0, l).mNext.mInverse.mNext.mInverse.mIndex, nbOplim, l), nbTot, l);
        }
      }

      nextP0.set(k);

      // P1 extensions for non-trivial group
      if (deg2 > 2) {
        nextP1.set(0);
      } else {
        k = 0;
        mEdgeFactory.resetMarks(mEdges);

        for (int i = 0; i < mState.mNumVertices; ++i) {
          if (mDegree[i] >= 4) {
            final Edge eLast = mFirstEdge[i];
            Edge e = eLast;
            do {
              if (!mEdgeFactory.isMarkedLo(e)) {
                if ((mDegree[e.mPrev.mEnd] == 2 ? 1 : 0) + (mDegree[e.mNext.mEnd] == 2 ? 1 : 0) == deg2) {
                  extP1[k++] = e;
                }
                mNumbering.markLo(1, nbTot, e.mIndex);
              }
              e = e.mNext;
            } while (e != eLast);
          }
        }
        nextP1.set(k);
      }
    }
  }
}
