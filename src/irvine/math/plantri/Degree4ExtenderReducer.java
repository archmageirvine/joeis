package irvine.math.plantri;

/**
 * Deletes the next edge and inserts a vertex with valence 4 in the resulting square.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Degree4ExtenderReducer implements ExtenderReducerWithSave {

  private final PlantriGraphState mState;

  Degree4ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* Deletes e.mNext and its inverse and puts a valence 4 vertex into the
     resulting square.
     In saveList[0..1] the deleted edges are stored. */

  @Override
  public Edge extend(Edge e, final Edge[] saveList) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    saveList[0] = e.mNext;
    saveList[1] = e.mNext.mInverse;

    final int k = EdgeCounts.star4(mState.mNumVertices);
    final Edge work1 = edges[k];
    final Edge work2 = edges[k + 1];
    final Edge work3 = edges[k + 2];
    final Edge work4 = edges[k + 3];
    firstEdge[mState.mNumVertices] = edges[k + 4];

    firstEdge[e.mStart] = e;
    // make sure firstEdge points at a valid edge afterwards

    // work1 starts at the beginning of e:

    work1.mStart = work1.mInverse.mEnd = e.mStart;
    work1.mNext = e.mNext.mNext;
    work1.mNext.mPrev = work1;
    work1.mPrev = e;
    e.mNext = work1;
    // the degree of e.mStart doesn't change

    // Now go one edge further around the square:
    e = e.mInverse.mPrev;

    work2.mStart = work2.mInverse.mEnd = e.mStart;
    e.mNext.mPrev = work2;
    work2.mNext = e.mNext;
    work2.mPrev = e;
    e.mNext = work2;
    degree[e.mStart]++;

    // Now we have one edge to jump about again:
    e = e.mInverse.mPrev.mPrev;

    firstEdge[e.mStart] = e;
    // Again an edge is deleted...

    work3.mStart = work3.mInverse.mEnd = e.mStart;
    work3.mNext = e.mNext.mNext;
    work3.mNext.mPrev = work3;
    work3.mPrev = e;
    e.mNext = work3;
    // the degree of e.mStart doesn't change

    // Now go again one edge further around the square:
    e = e.mInverse.mPrev;

    work4.mStart = work4.mInverse.mEnd = e.mStart;
    e.mNext.mPrev = work4;
    work4.mNext = e.mNext;
    work4.mPrev = e;
    e.mNext = work4;
    degree[e.mStart]++;

    degree[mState.mNumVertices] = 4;

    // Now I have 6 edges and one vertex more
    mState.mNumEdges += 6;
    mState.mNumVertices++;
    return e;
  }

  /* The inverse operation to extend4().
     Deletes the vertex with valence 4 in the triangle on the right hand side
     (.mNext-direction) of the edge e that is not contained in e. It is not
     checked whether the vertex really has valence 4 -- this has to be made
     sure in advance. The vector saveList[] must contain the edges deleted before.
     It might be that one of the edges leading to the new vertex now is
     an entry of mFirstEdge[] */
  @Override
  public void reduce(Edge e, final Edge[] saveList) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    firstEdge[e.mStart] = e;

    saveList[0].mNext.mPrev = saveList[0];
    e.mNext = saveList[0];
    e = e.mInverse;

    firstEdge[e.mStart] = e;
    // Now delete on the .mPrev side
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    degree[e.mStart]--;
    e = e.mPrev.mInverse;

    firstEdge[e.mStart] = e;
    // Again on the .mPrev side:
    saveList[1].mPrev.mNext = saveList[1];
    e.mPrev = saveList[1];

    e = saveList[1].mPrev.mInverse;
    firstEdge[e.mStart] = e;
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    degree[e.mStart]--;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }
}
