package irvine.math.plantri;

/**
 * Extends a graph in the way given by the type c extension for 5-connected triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5CExtenderReducer implements ExtenderReducerWithSave {

  private final PlantriGraphState mState;

  Min5CExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* extends a graph in the way given by the type c extension for
   5-connected triangulations. The edge e must mStart at
   a vertex of degree 5.

   It returns the edge characterizing this operation. This edge as
   well as the edge pointed to by *anchor must be given to the reduction
   routine.
  */

  @Override
  public Edge extend(final Edge e, final Edge[] anchor) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    anchor[0] = e;

    final Edge e1 = e.mInverse.mNext;
    final Edge e1i = e1.mInverse;
    final Edge e2 = e1i.mNext.mNext;
    final Edge e2i = e2.mInverse;
    final Edge e3 = e2i.mNext.mNext;
    final Edge e3i = e3.mInverse;
    final Edge e4 = e3i.mNext.mNext;
    final Edge e4i = e4.mInverse;
    final Edge e5 = e4i.mNext.mNext;
    final Edge e5i = e5.mInverse;

    final int origin = e.mStart;
    final int v1 = e1.mStart;
    final int v2 = e1.mEnd;
    final int v3 = e3.mStart;
    final int v4 = e3.mEnd;
    final int v5 = e5.mStart;

    final int start = EdgeCounts.min5C(mState.mNumVertices);

    firstEdge[v1] = e1;
    degree[v1]++;
    firstEdge[v2] = e2;
    degree[v2]++;
    firstEdge[v3] = e3;
    degree[v3]++;
    firstEdge[v4] = e4;
    degree[v4]++;
    firstEdge[v5] = e5;
    degree[v5]++;

    firstEdge[mState.mNumVertices] = edges[start + 10];
    degree[mState.mNumVertices++] = 5;
    firstEdge[mState.mNumVertices] = edges[start + 16];
    degree[mState.mNumVertices++] = 5;
    firstEdge[mState.mNumVertices] = edges[start + 23];
    degree[mState.mNumVertices++] = 5;
    firstEdge[mState.mNumVertices] = edges[start + 28];
    degree[mState.mNumVertices++] = 5;
    firstEdge[mState.mNumVertices] = edges[start + 35];
    degree[mState.mNumVertices++] = 5;
    firstEdge[origin] = edges[start + 32];
    // degree[mState.mNumVertices]=5; is already the case

    mState.mNumEdges += 30;

    e1.mPrev = edges[start];
    edges[start].mNext = e1;
    int run = start + 1;
    e5i.mNext = edges[run];
    edges[run++].mPrev = e5i;
    e5.mPrev = edges[run];
    edges[run++].mNext = e5;
    e4i.mNext = edges[run];
    edges[run++].mPrev = e4i;
    e4.mPrev = edges[run];
    edges[run++].mNext = e4;
    e3i.mNext = edges[run];
    edges[run++].mPrev = e3i;
    e3.mPrev = edges[run];
    edges[run++].mNext = e3;
    e2i.mNext = edges[run];
    edges[run++].mPrev = e2i;
    e2.mPrev = edges[run];
    edges[run++].mNext = e2;
    e1i.mNext = edges[run];
    edges[run].mPrev = e1i;

    edges[start].mStart = edges[start + 1].mStart = edges[start + 10].mEnd = edges[start + 15].mEnd = v1;
    edges[start + 8].mStart = edges[start + 9].mStart = edges[start + 14].mEnd = edges[start + 32].mEnd = v2;
    edges[start + 7].mStart = edges[start + 6].mStart = edges[start + 27].mEnd = edges[start + 31].mEnd = v3;
    edges[start + 4].mStart = edges[start + 5].mStart = edges[start + 22].mEnd = edges[start + 26].mEnd = v4;
    edges[start + 2].mStart = edges[start + 3].mStart = edges[start + 16].mEnd = edges[start + 21].mEnd = v5;
    edges[start + 8].mEnd = edges[start + 13].mEnd = edges[start + 39].mEnd = edges[start + 28].mEnd = edges[start + 7].mEnd = origin;
    edges[start + 30].mStart = edges[start + 31].mStart = edges[start + 32].mStart = edges[start + 33].mStart = edges[start + 34].mStart = origin;

    return edges[start + 35];
  }

  /* Like other reduction operations, this is not the reverse operation,
     but it relies on the map being EXACTLY the same as after the application
     of the corresponding extend operation. */

  @Override
  public void reduce(final Edge e, final Edge[] saveList) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    Edge anchor = saveList[0];

    final Edge e1 = e.mInverse.mPrev.mPrev.mInverse.mNext;
    final Edge e1i = e1.mInverse;
    final Edge e2 = e1i.mNext.mNext.mNext;
    final Edge e2i = e2.mInverse;
    final Edge e3 = e2i.mNext.mNext.mNext;
    final Edge e3i = e3.mInverse;
    final Edge e4 = e3i.mNext.mNext.mNext;
    final Edge e4i = e4.mInverse;
    final Edge e5 = e4i.mNext.mNext.mNext;
    final Edge e5i = e5.mInverse;

    final int v1 = e1.mStart;
    final int v2 = e1.mEnd;
    final int v3 = e3.mStart;
    final int v4 = e3.mEnd;
    final int v5 = e5.mStart;
    final int origin = anchor.mStart;

    firstEdge[v1] = e1;
    degree[v1]--;
    firstEdge[v2] = e2;
    degree[v2]--;
    firstEdge[v3] = e3;
    degree[v3]--;
    firstEdge[v4] = e4;
    degree[v4]--;
    firstEdge[v5] = e5;
    degree[v5]--;
    firstEdge[origin] = anchor;

    mState.mNumVertices -= 5;
    mState.mNumEdges -= 30;

    e1.mPrev = e5i.mNext = anchor.mInverse;
    anchor = anchor.mPrev;
    e2.mPrev = e1i.mNext = anchor.mInverse;
    anchor = anchor.mPrev;
    e3.mPrev = e2i.mNext = anchor.mInverse;
    anchor = anchor.mPrev;
    e4.mPrev = e3i.mNext = anchor.mInverse;
    anchor = anchor.mPrev;
    e5.mPrev = e4i.mNext = anchor.mInverse;
  }
}
