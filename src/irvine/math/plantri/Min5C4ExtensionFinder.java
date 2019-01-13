package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5C4ExtensionFinder {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;

  Min5C4ExtensionFinder(final Plantri plantri, final Numbering numbering, final Marks vertexMarks) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
  }

  /* Returns true, if the endpoints of e and e1 have a common neighbour
     with valency 5, different from their mStart and different from
     e.mPrev.mEnd, e.mNext.mEnd, e1.mPrev.mEnd, e1.mNext.mEnd, false else.
    It is assumed that the starting points of e, e1 are the same, and that
  */
  boolean common5EndPoint(Edge e, Edge e1) {
    mVertexMarks.resetMarksVertex();

    e = e.mInverse;
    e1 = e1.mInverse;

    Edge run = e.mNext.mNext;
    if (mDegree[run.mEnd] == 5) {
      mVertexMarks.markVertex(run.mEnd);
    }
    run = run.mNext;
    if (mDegree[run.mEnd] == 5) {
      mVertexMarks.markVertex(run.mEnd);
    }
    Edge last = e.mPrev.mPrev;
    while (run != last) {
      run = run.mNext;
      if (mDegree[run.mEnd] == 5) {
        mVertexMarks.markVertex(run.mEnd);
      }
    }

    run = e1.mNext.mNext;
    if (mVertexMarks.isMarkedVertex(run.mEnd)) {
      return true;
    }
    run = run.mNext;
    if (mVertexMarks.isMarkedVertex(run.mEnd)) {
      return true;
    }
    last = e1.mPrev.mPrev;
    return mPlantri.checkIfPathMarked(run, last);
  }

  /* returns the list of legal 5-expansions for the minDeg5 4-connectivity
     case, that is of (undirected) pairs of edges so that:

     (i) both edges mStart at the same point of valency >=6
     (ii) in between them there are (on one side) exactly two edges and
          these are not on an nf-4-cycle
     (iii) their endpoints have a common neighbour of valency 5 (so
           especially both edges must be on an nf-4-cycle)

     The list comes in pairs of two, that is: for 0<=i<*listLength
     list1[i] and list2[i] belong together.

     It is assumed that there are no nf-3-cycles.

     nf4cycleedges[] must be a list of all undirected edges -- that
     is: always containing edge.mMin lying on nf-4-cycles and
     numnf4cycleedges their number.
  */
  private int make5ExpList(final Edge[] list1, final Edge[] list2, final Edge[] nf4cycleedges, final int numnf4cycleedges) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    for (int i = numnf4cycleedges; --i >= 0; ) {
      ef.markLo(nf4cycleedges[i]);
      ef.markLo(nf4cycleedges[i].mInverse);
    }

    int listLength = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        Edge run = mFirstEdge[i];
        if (mDegree[i] == 6)
          /* This case is special, since for opposite edges, the "same" expansion
             would be done, but different edges would be checked to judge whether
             it is legal. If deg>6 there is a 1-1 correspondence between the two
             edges in between and the expansion edge pair */ {
          final Edge end = run.mNext.mNext.mNext;
          do {
            if (ef.isMarkedLo(run)) {
              final Edge run1 = run.mNext.mNext.mNext;
              /* is done inside the loop and not as a second run variable,
                 since most likely the loop is entered not too often, so
                 that in those rare cases where it is entered, it pays off
                 to have three "nexts". */
              if (ef.isMarkedLo(run1) && ((!ef.isMarkedLo(run.mNext) && !ef.isMarkedLo(run1.mPrev))
                || (!ef.isMarkedLo(run1.mNext) && !ef.isMarkedLo(run.mPrev)))) {
                if (common5EndPoint(run, run1)) {
                  list1[listLength] = run;
                  list2[listLength] = run1;
                  ++listLength;
                }
              }
            }
            run = run.mNext;
          }
          while (run != end);
        } else { // degree > 6
          final Edge end = run;
          do {
            if (ef.isMarkedLo(run)) {
              final Edge run1 = run.mNext.mNext.mNext;
              if (ef.isMarkedLo(run1) && (!ef.isMarkedLo(run.mNext) && !ef.isMarkedLo(run1.mPrev))) {
                if (common5EndPoint(run, run1)) {
                  list1[listLength] = run;
                  list2[listLength] = run1;
                  ++listLength;
                }
              }
            }
            run = run.mNext;
          }
          while (run != end);
        } // else deg>6
      } // end deg>=6
    }
    return listLength;
  }
  /* returns true if it is the center of a bangle, false otherwise 4-connected case of minDeg 5 */
  private boolean is4BangleCentre(Edge e) {
    mVertexMarks.resetMarksVertex();

    Edge dummy = e.mNext.mInverse;
    Edge last = dummy.mPrev;
    Edge run = dummy.mNext.mNext;
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, last);
    e = e.mPrev.mInverse;

    run = e.mNext;
    last = e.mPrev.mPrev;
    dummy = run.mInverse;
    Edge last1 = dummy.mPrev.mPrev;
    Edge run1 = dummy.mNext.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    run1 = run1.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    if (mPlantri.checkIfPathMarked(run1, last1)) {
      return true;
    }
    while (run != last) {
      run = run.mNext;
      dummy = run.mInverse;
      last1 = dummy.mPrev.mPrev;
      run1 = dummy.mNext.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return true;
      }
      run1 = run1.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return true;
      }
      if (mPlantri.checkIfPathMarked(run1, last1)) {
        return true;
      }
    }
    return false;
  }

  /* Returns true if after switching e will be on an nf-3-cycle, false else.
     Assumes that there are no nf 3-cycles already and that the mins of all
     edges on nf-4-cycles are marked low. */
  private boolean willBeOnNf3Cycle(final Edge e) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    if ((!ef.isMarkedLo(e.mNext.mMin)) || (!ef.isMarkedLo(e.mPrev.mMin))) {
      return false;
    }
    // If after switching it is on an nf-3-cycle, then they are on an nf-4-cycle already
    mVertexMarks.resetMarksVertex();

    Edge dummy = e.mNext.mInverse;
    Edge run = dummy.mNext.mNext;
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, dummy.mPrev);
    dummy = e.mPrev.mInverse;
    run = dummy.mNext;
    return mVertexMarks.isMarkedVertex(run.mEnd) || mPlantri.checkIfPathMarked(run, dummy.mPrev.mPrev);
  }


  /* Returns the list of legal 4-bangles, that is of (undirected) edges so that:

       (i) both endvertices have valency >=6
       (ii) it is not on an nf-4-cycle at the moment
       (iii) it is the center of a bangle
       (iv) after switching it is not on an nf-3-cycle

     It is assumed that there are no nf-3-cycles.

     nf4cycleedges[] must be a list of all undirected edges -- that
     is: always containing edge.mMin lying on nf-4-cycles and
     numnf4cycleedges their number.
  */
  private int make4BangleList(final Edge[] list, final Edge[] nf4cycleedges, int numnf4cycleedges) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    while (--numnf4cycleedges >= 0) {
      ef.markLo(nf4cycleedges[numnf4cycleedges]);
    }

    int listLength = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        final Edge end = mFirstEdge[i];
        Edge run = end;
        do {
          if (run == run.mMin && mDegree[run.mEnd] >= 6 && !ef.isMarkedLo(run)
            && is4BangleCentre(run) && !willBeOnNf3Cycle(run)) {
            list[listLength++] = run;
          }
          run = run.mNext;
        }
        while (run != end);
      }
    }
    return listLength;
  }


  /* List the inequivalent extensions for the 4-connected phase on minDeg 5.
     If bang!=null, it is a list of all bangles perhaps with some of
     insufficient degree.  If on4!=null, on4[0..non4-1] is a list of all edges
     on nf-4-cycles (mMin form).  If on4==null, there are no nf-4-cycles and
     non4=0.  Exactly one of bang and on4 is null.

     As a result, ext5sw[0..*next5sw-1] is set to all feasible switching
     operations, and (ext551,ext552)[0..*next55-1] is set to all feasible
     5-expansions as pairs of edges.  Equivalent extensions are removed.
  */
  int findExtensions(final int nbTot, final Edge[] bang, final int nbang,
                     final Edge[] on4, final int non4, final Edge[] ext5sw, final MutableInteger next5sw,
                     final Edge[] ext551, final Edge[] ext552) {
    if (bang != null) {
      for (int i = 0; i < nbang; ++i) {
        if (mDegree[bang[i].mStart] >= 6 && mDegree[bang[i].mEnd] >= 6) {
          ext5sw[next5sw.postIncrement()] = bang[i];
        }
      }
    } else {
      next5sw.set(make4BangleList(ext5sw, on4, non4));
    }

    if (nbTot > 1 && next5sw.get() > 1) {
      next5sw.set(mPlantri.pruneEdgeList(ext5sw, next5sw.get(), nbTot));
    }

    if (mState.mNumVertices < mPlantri.mMaxNV && on4 != null && non4 >= 6) {
      final int next55 = make5ExpList(ext551, ext552, on4, non4);

      if (nbTot == 1 || next55 <= 1) {
        return next55;
      }

      mNumbering.resetToIdentity(mState.mNumEdges);

      int k = 0;
      for (int i = 0; i < next55; ++i) {
        final Edge e1;
        final Edge e2;
        if (ext551[i].mAlloc < ext552[i].mAlloc) {
          e1 = ext551[i];
          e2 = ext552[i];
        } else {
          e1 = ext552[i];
          e2 = ext551[i];
        }

        int nb1 = 1;
        for (; nb1 < nbTot; ++nb1) {
          if (mNumbering.get(nb1, e1.mIndex).mAlloc < mNumbering.get(nb1, e2.mIndex).mAlloc) {
            if (mNumbering.get(nb1, e1.mIndex).mAlloc < e1.mAlloc || (mNumbering.get(nb1, e1.mIndex) == e1 && mNumbering.get(nb1, e2.mIndex).mAlloc < e2.mAlloc)) {
              break;
            }
          } else {
            if (mNumbering.get(nb1, e2.mIndex).mAlloc < e1.mAlloc || (mNumbering.get(nb1, e2.mIndex) == e1 && mNumbering.get(nb1, e1.mIndex).mAlloc < e2.mAlloc)) {
              break;
            }
          }
        }

        if (nb1 >= nbTot) {
          ext551[k] = e1;
          ext552[k++] = e2;
        }
      }
      return k;
    } else {
      return 0;
    }
  }
}
