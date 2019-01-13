package irvine.math.plantri;

/**
 * Represent an edge.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Edge {

  final int mAlloc;
  int mStart;         // Vertex where the edge starts
  int mEnd;           // Vertex where the edge ends
  int mRightFace;     // Face on the right side of the edge; note: only valid if makeDual() called
  Edge mPrev;         // Previous edge in clockwise direction
  Edge mNext;         // Next edge in clockwise direction
  Edge mInverse;      // The edge that is inverse to this one
  Edge mMin;          // The least of e and e.mInverse
  int mMark;          // Two ints for temporary use;  Only access mMark via the mMark macros.
  int mIndex;
  int mLeftFaceSize;  // Size of the face in prev-direction of the edge. Only used for -p option.

  Edge(final int number) {
    mAlloc = number;
  }

  /* tests whether the graph obtained by deleting edge e is still 3-connected.
     The edge e may have been deleted or not, but the values in e must be
     as before it was (possibly) deleted. The map must have been 3-connected
     before -- so especially there weren't any vertices of degree 2.
     degree[] is not assumed correct for the end vertices of e.

     On the left hand side of e there must be a triangle
     (e.mLeftFaceSize==3) and it is assumed that it is checked before
     that the end vertices of e have degree at least 3 after the deletion.

     If there is a 2-cut, e.mStart and e.mEnd cannot be contained, but they
     must be in different components, so v=e.mPrev.mEnd MUST be contained.
     It is checked whether v is contained in a face that shares yet another
     vertex with the face formerly on the right hand side of e (the new face
     obtained by deleting e).

     Returns 1 if it is 3-connected after deleting e, 0 else.  */
  boolean threeConn(final PolytopeScanner scanner) {
    Edge start = mPrev.mInverse;
    if (scanner.mDegree[start.mStart] == 3) {
      return true;
    }

    scanner.mVertexMarks.resetMarksVertex();

    // The end vertices of e need not be marked
    for (Edge run = mNext, end = mInverse.mPrev.mInverse; run != end; run = run.mInverse.mNext) {
      scanner.mVertexMarks.markVertex(run.mEnd);
    }

    final Edge end = start.mPrev.mPrev; // stops the running around the vertex before  the last face

    // The first face and the last face contain also one of the end vertices of e,
    // so if they also contain marked vertices, then there already was a 2-cut.
    start = start.mNext;

    while (start != end) {
      Edge run = start.mInverse;
      start = start.mNext;
      for (; run != start; run = run.mPrev.mInverse) {
        if (scanner.mVertexMarks.isMarkedVertex(run.mStart)) {
          return false;
        }
      }
    }
    return true;
  }

  /* Given an edge leaving a vertex of degree 5.  This function returns
     true if e.mEnd is not adjacent to either e.mNext.mNext.mEnd or
     e.mNext.mNext.mNext.mEnd, and false otherwise. */
  boolean isValid5Edge() {
    final Edge ea = mNext.mNext;
    final int u = ea.mEnd;
    final int v = ea.mNext.mEnd;
    final Edge ex = mInverse;
    for (Edge e1 = ex.mNext; e1 != ex; e1 = e1.mNext) {
      if (e1.mEnd == u || e1.mEnd == v) {
        return false;
      }
    }
    return true;
  }
}
