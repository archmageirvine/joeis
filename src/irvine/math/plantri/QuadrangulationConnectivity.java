package irvine.math.plantri;

/**
 * Tests and returns the connectivity of a simple quadrangulation.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class QuadrangulationConnectivity {

  private final PlantriGraphState mState;
  private final EdgeFactory mEdgeFactory;
  private final int[] mDegree;
  private final Edge[] mEdges;
  // Remember edges or vertices where the last time there was a problem -- test these first
  private Edge mLastProb = null;
  private int mLastDeg = -1;

  QuadrangulationConnectivity(final PlantriGraphState state, final EdgeFactory edgeFactory) {
    mState = state;
    mEdgeFactory = edgeFactory;
    mDegree = state.mDegree;
    mEdges = state.mEdges;
  }

  /* Tests and returns the connectivity of a simple quadrangulation.  Possible values are 2 and 3 */
  int isConnected() {
    if (mLastDeg >= 0 && mDegree[mLastDeg] == 2) {
      return 2;
    }

    mEdgeFactory.resetMarks(mEdges);

    if (mLastProb != null && mDegree[mLastProb.mStart] > 3) {
      mEdgeFactory.mark(mLastProb);
      final Edge buffer = mLastProb.mInverse.mPrev;
      final int othervertex = buffer.mEnd;
      if (mDegree[othervertex] > 3) {
        mEdgeFactory.mark(buffer.mInverse.mPrev);
        final Edge runend = mLastProb.mPrev;
        Edge run = mLastProb.mNext.mNext;
        while (run != runend) {
          if (run.mInverse.mPrev.mEnd == othervertex) {
            return 2;
          }
          run = run.mNext;
        }
      }
    }

    mLastDeg = -1;
    mLastProb = null;

    for (int k = 0; k < mState.mNumVertices; ++k) {
      if (mDegree[k] == 2) {
        mLastDeg = k;
        return 2;
      }
    }

    // Note: edges on the other side of degree 3 vertices in a
    //   quadrangle can be marked as non-starts. but this makes it
    //   much slower (doing it in the loop or doing it before.
    //   Don't ask why...
    for (int k = 0; k < mState.mNumVertices - 1; ++k) {
      // the faces around mState.mNumVertices are all tested from the other side
      if (mDegree[k] > 3) {
        final Edge end = mState.mFirstEdge[k]; // checking face on the right
        Edge start = end;
        do {
          if (!mEdgeFactory.isMarked(start)) {
            mEdgeFactory.mark(start);
            final Edge buffer = start.mInverse.mPrev;
            final int othervertex = buffer.mEnd;
            if (mDegree[othervertex] > 3) {
              mEdgeFactory.mark(buffer.mInverse.mPrev);
              final Edge runend = start.mPrev;
              Edge run = start.mNext.mNext;
              while (run != runend) {
                if (run.mInverse.mPrev.mEnd == othervertex) {
                  mLastProb = start;
                  return 2;
                }
                run = run.mNext;
              }
            }
            // Makes it slower... -- also outside the edge-loop
            // if (degree[k]==4)
            //        { mark(mStart.mNext.mNext);
            //        mark(mStart.mPrev.mInverse.mNext.mInverse);
            //        }
          }
          start = start.mNext;
        } while (start != end);
      }
    }
    return 3;
  }
}
