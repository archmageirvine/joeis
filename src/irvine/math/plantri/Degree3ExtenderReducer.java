package irvine.math.plantri;

/**
 * Inserts a vertex with valence 3 in the triangle on the right hand side (next direction) of the edge.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Degree3ExtenderReducer implements ExtenderReducer {
  
  private final PlantriGraphState mState;

  Degree3ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  private void extend(final Edge e, final Edge f) {
    f.mInverse.mEnd = e.mStart;
    f.mStart = e.mStart;
    e.mNext.mPrev = f;
    f.mNext = e.mNext;
    f.mPrev = e;
    e.mNext = f;
    mState.mDegree[e.mStart]++;
  }

  @Override
  public Edge extend(Edge e) {
    final int ws = EdgeCounts.star3(mState.mNumVertices);
    mState.mFirstEdge[mState.mNumVertices] = mState.mEdges[ws + 3];

    // Starts at the beginning of e:
    extend(e, mState.mEdges[ws]);

    // Now go one edge further around the triangle and the same once more
    e = e.mInverse.mPrev;
    extend(e, mState.mEdges[ws + 1]);

    e = e.mInverse.mPrev;
    extend(e, mState.mEdges[ws + 2]);

    mState.mDegree[mState.mNumVertices] = 3;

    // Now I have 6 edges and one vertex more
    mState.mNumEdges += 6;
    mState.mNumVertices++;
    return e;
  }

  /* deletes a vertex with valence 3 in the triangle on the right hand side
   (.next-direction) of the edge e. It is not checked whether the vertex
   really has valence 3 -- this has to be made sure in advance      */

  @Override
  public void reduce(Edge e) {
    // It might be that one of the edges leading to the new vertex now is an entry of mState.mFirstEdge[]

    // If (mState.mFirstEdge[e.mStart]==e.mNext) would take too much time, so just
    mState.mFirstEdge[e.mStart] = e;
    e.mNext = e.mNext.mNext;
    e.mNext.mPrev = e;
    mState.mDegree[e.mStart]--;
    e = e.mInverse;

    mState.mFirstEdge[e.mStart] = e;
    // Now delete on the .mPrev side
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    mState.mDegree[e.mStart]--;
    e = e.mPrev.mInverse;

    mState.mFirstEdge[e.mStart] = e;
    // Again on the .mPrev side:
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    mState.mDegree[e.mStart]--;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }
}
