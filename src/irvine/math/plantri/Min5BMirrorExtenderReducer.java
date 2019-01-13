package irvine.math.plantri;

/**
 * Extends a graph in the way given by the type b extension for 5-connected triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5BMirrorExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  Min5BMirrorExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* extends a graph in the way given by the type b extension for
     5-connected triangulations. The edge e must start and end at
     a vertex of degree 5.

     It returns the edge characterizing this operation.
  */

  @Override
  public Edge extend(final Edge e) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    final Edge ei = e.mInverse;
    final Edge work2 = e.mPrev;
    final Edge work3 = work2.mPrev;
    final Edge e3i = work3.mPrev;
    final Edge e3 = e3i.mInverse;
    final Edge e5i = e3.mPrev;
    final Edge work1 = ei.mNext;
    final Edge e2 = work1.mNext;
    final Edge e2i = e2.mInverse;
    final Edge e4 = e2i.mNext;

    final int center1 = e.mEnd;
    final int center2 = e.mStart;
    final int start3 = e3.mStart;
    final int end2 = e2.mEnd;

    final int start = EdgeCounts.min5B1(mState.mNumVertices);

    work1.mStart = work1.mInverse.mEnd = mState.mNumVertices;
    firstEdge[mState.mNumVertices] = work1;
    degree[mState.mNumVertices] = 5;

    work2.mStart = work2.mInverse.mEnd = work3.mStart = work3.mInverse.mEnd = mState.mNumVertices + 1;
    firstEdge[mState.mNumVertices + 1] = work2;
    degree[mState.mNumVertices + 1] = 5;

    firstEdge[center1] = ei;
    firstEdge[center2] = e;

    // The degree at center1 and center2 remains unchanged
    edges[start].mStart = end2;
    edges[start].mNext = e4;
    e4.mPrev = edges[start];
    edges[start].mPrev = e2i;
    e2i.mNext = edges[start];
    ++degree[end2];

    int run = start + 1;
    edges[run].mEnd = end2;
    edges[run].mPrev = work1;
    work1.mNext = edges[run];

    ++run; /*2*/
    edges[run].mStart = edges[run + 1].mEnd = center1;
    edges[run].mNext = e2;
    e2.mPrev = edges[run];
    edges[run].mPrev = ei;
    ei.mNext = edges[run];

    run += 2; /*4*/
    edges[run].mStart = edges[run + 1].mEnd = center2;
    edges[run].mNext = e;
    e.mPrev = edges[run];

    run += 2; /*6*/
    edges[run].mPrev = work2;
    work2.mNext = edges[run];

    ++run; /*7*/
    edges[run].mNext = work1;
    work1.mPrev = edges[run];

    ++run; /*8*/
    edges[run].mStart = edges[run + 1].mEnd = center2;
    edges[run].mPrev = e3i;
    e3i.mNext = edges[run];

    run += 2; /*10*/
    edges[run].mStart = start3;
    edges[run].mPrev = e5i;
    e5i.mNext = edges[run];
    edges[run].mNext = e3;
    e3.mPrev = edges[run];

    ++run; /*11*/
    edges[run].mEnd = start3;
    edges[run].mNext = work3;
    work3.mPrev = edges[run];
    ++degree[start3];

    mState.mNumVertices += 2;
    mState.mNumEdges += 12;

    return edges[start + 4]; /* is the smaller one */
  }

  @Override
  public void reduce(final Edge ref) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    final Edge e = ref.mNext;
    final Edge ei = e.mInverse;
    final Edge e2 = ei.mNext.mNext;
    final Edge e2i = e2.mInverse;
    final Edge e4 = e2i.mNext.mNext;
    final Edge work1 = e4.mPrev.mInverse.mPrev;
    final Edge e3i = e.mNext.mNext;
    final Edge e3 = e3i.mInverse;
    final Edge e5i = e3.mPrev.mPrev;
    final Edge work3 = e5i.mNext.mInverse.mNext;
    final Edge work2 = work3.mNext;

    final int end2 = e2.mEnd;
    final int center1 = e.mEnd;
    final int center2 = e.mStart;
    final int start3 = e3.mStart;

    --degree[end2];
    --degree[start3];

    firstEdge[end2] = e4;
    firstEdge[center1] = ei;
    firstEdge[center2] = e;
    firstEdge[start3] = e3;

    e4.mPrev = e2i;
    e2i.mNext = e4;
    e2.mPrev = work1;
    work1.mNext = e2;
    ei.mNext = work1;
    work1.mPrev = ei;
    e.mPrev = work2;
    work2.mNext = e;
    e3i.mNext = work3;
    work3.mPrev = e3i;
    e3.mPrev = e5i;
    e5i.mNext = e3;

    work1.mStart = work1.mInverse.mEnd = center1;
    work2.mStart = work2.mInverse.mEnd = work3.mStart = work3.mInverse.mEnd = center2;

    mState.mNumVertices -= 2;
    mState.mNumEdges -= 12;
  }
}
