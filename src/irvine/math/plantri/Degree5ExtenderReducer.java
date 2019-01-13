package irvine.math.plantri;

/**
 * Deletes the next edge and its next edge and their inverses and puts in a vertex with valence 5 in the resulting pentagon.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Degree5ExtenderReducer implements ExtenderReducerWithSave {

  private final PlantriGraphState mState;

  Degree5ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* Deletes e.mNext, e.mNext.mNext and their inverse and puts a valence
     5 vertex into the resulting pentagon.
     In list[0..3] the deleted edges are stored. This list must be handed
     to reduce5() */

  @Override
  public Edge extend(Edge e, final Edge[] saveList) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    saveList[0] = e.mNext;
    saveList[1] = e.mNext.mInverse;
    saveList[2] = e.mNext.mNext;
    saveList[3] = saveList[2].mInverse;

    final int ww = EdgeCounts.star5(mState.mNumVertices);
    final Edge work1 = edges[ww];
    final Edge work2 = edges[ww + 1];
    final Edge work3 = edges[ww + 2];
    final Edge work4 = edges[ww + 3];
    final Edge work5 = edges[ww + 4];
    firstEdge[mState.mNumVertices] = edges[ww + 5];

    firstEdge[e.mStart] = e;
    // make sure firstEdge points at a valid edge afterwards

    // work1 starts at the beginning of e:

    work1.mStart = work1.mInverse.mEnd = e.mStart;
    work1.mNext = e.mNext.mNext.mNext;
    work1.mNext.mPrev = work1;
    work1.mPrev = e;
    e.mNext = work1;
    degree[e.mStart]--;

    // Now go one edge further around the pentagon:
    e = e.mInverse.mPrev;

    work2.mStart = work2.mInverse.mEnd = e.mStart;
    e.mNext.mPrev = work2;
    work2.mNext = e.mNext;
    work2.mPrev = e;
    e.mNext = work2;
    degree[e.mStart]++;

    // Now go one edge further around the pentagon jumping over one edge: */

    e = e.mInverse.mPrev.mPrev;

    firstEdge[e.mStart] = e;
    // here also an edge is deleted

    work3.mStart = work3.mInverse.mEnd = e.mStart;
    work3.mNext = e.mNext.mNext;
    work3.mNext.mPrev = work3;
    work3.mPrev = e;
    e.mNext = work3;
    // the degree of e.mStart doesn't change

    // Again go one edge further around the pentagon jumping over one edge:

    e = e.mInverse.mPrev.mPrev;

    firstEdge[e.mStart] = e;
    // here also an edge is deleted

    work4.mStart = work4.mInverse.mEnd = e.mStart;
    work4.mNext = e.mNext.mNext;
    work4.mNext.mPrev = work4;
    work4.mPrev = e;
    e.mNext = work4;
    // the degree of e.mStart doesn't change

    // Finally go one edge further around the pentagon:
    e = e.mInverse.mPrev;

    work5.mStart = work5.mInverse.mEnd = e.mStart;
    e.mNext.mPrev = work5;
    work5.mNext = e.mNext;
    work5.mPrev = e;
    e.mNext = work5;
    degree[e.mStart]++;

    degree[mState.mNumVertices] = 5;

    // Now I have 6 edges and one vertex more

    mState.mNumEdges += 6;
    mState.mNumVertices++;
    return e;
  }

  /* The inverse operation to extend5().
     Deletes the vertex with valence 5 at the mEnd of e.mNext. It is not
     checked whether the vertex really has valence 5 -- this has to be made
     sure in advance. The vector saveList[] must contain the edges deleted before.
     It might be that one of the edges leading to the new vertex now is
     an entry of mFirstEdge[] */
  @Override
  public void reduce(Edge e, final Edge[] saveList) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    firstEdge[e.mStart] = e;

    e.mNext = saveList[0];
    saveList[2].mNext.mPrev = saveList[2];
    degree[e.mStart]++;

    e = e.mInverse;

    // Delete the edge on the mPrev side
    firstEdge[e.mStart] = e;
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    degree[e.mStart]--;

    e = e.mPrev.mInverse;

    firstEdge[e.mStart] = e;
    // Delete the edge and insert the old edge:
    e.mPrev = saveList[1];
    saveList[1].mPrev.mNext = saveList[1];

    e = e.mPrev.mPrev.mInverse;

    firstEdge[e.mStart] = e;
    // Delete the edge and insert the old edge:
    e.mPrev = saveList[3];
    saveList[3].mPrev.mNext = saveList[3];

    e = e.mPrev.mPrev.mInverse;

    firstEdge[e.mStart] = e;
    e.mPrev = e.mPrev.mPrev;
    e.mPrev.mNext = e;
    degree[e.mStart]--;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }
}
