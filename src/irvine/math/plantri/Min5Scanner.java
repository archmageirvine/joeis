package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Scanner.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Min5Scanner {

  protected final Plantri mPlantri;
  protected final PlantriGraphState mState;
  protected final int[] mDegree;
  protected final Edge[] mEdges;
  protected final Edge[] mFirstEdge;
  protected final Numbering mNumbering;
  protected final Min5ExtensionFinder mMin5Finder;
  protected final Min5C4ExtensionFinder mMin5C4Finder;
  private final Marks mVertexMarks;
  protected final Min5AExtenderReducer mMin5A;
  protected final Min5BExtenderReducer mMin5B;
  private final ExtenderReducer mMin5Bm;
  protected final ExtenderReducerWithSave mMin5C;
  protected final boolean mNeedGroup;

  Min5Scanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final boolean needGroup) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
    mMin5Finder = new Min5ExtensionFinder(plantri, numbering, vertexMarks);
    mMin5C4Finder = new Min5C4ExtensionFinder(plantri, numbering, vertexMarks);
    mMin5A = new Min5AExtenderReducer(plantri);
    mMin5B = new Min5BExtenderReducer(mState, mVertexMarks, plantri.mEdgeFactory);
    mMin5Bm = new Min5BMirrorExtenderReducer(mState);
    mMin5C = new Min5CExtenderReducer(mState);
    mNeedGroup = needGroup;
  }

  protected Edge extendMin5B(final Edge e, final boolean doMirror) {
    return (doMirror ? mMin5Bm : mMin5B).extend(e);
  }

  protected void reduceMin5B(final Edge ref, final boolean doMirror) {
    (doMirror ? mMin5Bm : mMin5B).reduce(ref);
  }


  private int bangCol(final Edge e) {
    return (mDegree[e.mStart] << 10) | mDegree[e.mEnd];
  }

  private int bangCol2(final Edge e) {
    return mDegree[e.mNext.mEnd] + mDegree[e.mPrev.mEnd];
  }

  /* returns 1 if after switching e won't be on an nf 3-cycle. */
  private boolean wontBeOnNf3Cycle(Edge e) {
    mVertexMarks.resetMarksVertex();
    final Edge dummy = e.mNext.mInverse;
    Edge last = dummy.mPrev;
    Edge run = dummy.mNext.mNext;
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, last);
    e = e.mPrev.mInverse;
    run = e.mNext;
    last = e.mPrev.mPrev;
    return !mVertexMarks.isMarkedVertex(run.mEnd) && !mPlantri.checkIfPathMarked(run, last);
  }


  /* returns 1 if it is the center of a 3bangle and after the edge is
     switched it is not in a double edge, 0 else */
  private boolean is3BanglecenterNotdouble(Edge e) {
    mVertexMarks.resetMarksVertex();

    final Edge dummy = e.mNext.mInverse;
    e = e.mPrev.mInverse;
    final int end = e.mStart;

    Edge last = dummy.mPrev;
    Edge run = dummy.mNext.mNext;
    if (run.mEnd == end) {
      return false;
    }
    mVertexMarks.markVertex(run.mEnd);
    while (run != last) {
      run = run.mNext;
      if (run.mEnd == end) {
        return false;
      }
      mVertexMarks.markVertex(run.mEnd);
    }

    run = e.mNext;
    last = e.mPrev.mPrev;
    return mVertexMarks.isMarkedVertex(run.mEnd) || mPlantri.checkIfPathMarked(run, last);
  }

  /* Test if the graph has a B-reduction */
  protected boolean hasMin5B() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 5) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          if (e == e.mMin && mDegree[e.mEnd] == 5 && mDegree[e.mPrev.mEnd] == 5 && mDegree[e.mNext.mEnd] == 5
            && (mMin5B.isValidMin5B(e, false) || mMin5B.isValidMin5B(e, true))) {
            return true;
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }
    return false;
  }

  /* returns the list of legal 3-bangles, that is of (undirected) edges
     so that:

     (i) both endvertices have valency >=6
     (ii) it is not on an nf-3-cycle at the moment
     (iii) it is the center of a 3bangle
     (iv) after switching it is not in a double edge

     nf3cycleedges[] must be a list of all undirected edges -- that
     is: always containing edge.mMin lying on nf-3-cycles and
     numnf3cycleedges their number.
  */
  private int make3BangleList(final Edge[] list, final Edge[] nf3cycleedges, int numNf3CycleEdges) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    while (--numNf3CycleEdges >= 0) {
      ef.markLo(nf3cycleedges[numNf3CycleEdges]);
    }

    int listLength = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        final Edge end = mFirstEdge[i];
        Edge run = end;
        do {
          if (run == run.mMin && mDegree[run.mEnd] >= 6 && !ef.isMarkedLo(run) && is3BanglecenterNotdouble(run)) {
            list[listLength++] = run;
          }
          run = run.mNext;
        }
        while (run != end);
      }
    }
    return listLength;
  }

  /* List the inequivalent extensions for the 3-connected phase on minDeg 5.
     If on4!=null, it is a list of all edges on nf4-cycles (mMin form).
     If on3!=null, on3[0..nOn3-1] is a list of all edges on nf-3-cycles
     (mMin form).  If on3==null, there are no nf-3-cycles and nOn3==0.
     Exactly one of on4 and on3 is null.

     As a result, ext5sw[0..*next5sw-1] is set to all feasible switching
     operations.  Equivalent extensions are removed.
  */
  private int findExtensionsMin5C3(final int nbTot, final Edge[] on3, final int nOn3, final Edge[] ext5sw) {
    int next5sw = make3BangleList(ext5sw, on3, nOn3);
    if (nbTot > 1 && next5sw > 1) {
      next5sw = mPlantri.pruneEdgeList(ext5sw, next5sw, nbTot);
    }
    return next5sw;
  }

  private int sw53Col(final Edge e) {
    return (mDegree[e.mStart] << 10) | mDegree[e.mEnd];
  }

  /* Edge e (mMin form) has been switched (3-connected phase of minDeg=5).
     on3[0..non3-1] are all the edges in nf-3-cycles.
     Put into good[0..nGood-1] edges as desired for canonEdge().
  */
  private int min5C3SwLegal(final Edge e, final Edge[] on3, final int non3, final Edge[] good) {
    long bestcol = sw53Col(e);
    long col = sw53Col(e.mInverse);
    int ng;
    if (bestcol > col) {
      good[0] = e;
      ng = 1;
    } else if (bestcol == col) {
      good[0] = e;
      good[1] = e.mInverse;
      ng = 2;
    } else {
      good[0] = e.mInverse;
      ng = 1;
      bestcol = col;
    }

    for (int i = 0; i < non3; ++i) {
      final Edge e1 = on3[i];
      final Edge e2 = e1.mInverse;
      if (mDegree[e1.mStart] >= 6 && mDegree[e1.mEnd] >= 6 && e1 != e && wontBeOnNf3Cycle(e1)) {
        col = sw53Col(e1);
        if (col > bestcol) {
          return 0;
        } else if (col == bestcol) {
          good[ng++] = e1;
        }

        col = sw53Col(e2);
        if (col > bestcol) {
          return 0;
        } else if (col == bestcol) {
          good[ng++] = e2;
        }
      }
    }
    return ng;
  }


  /* The edge e has just been switched.  Previously it was not on any
     nf-3-cycles and on3[0..non3-1] was a list of all edges on nf-3-cycles.
     Add any new nf-3-cycles to on3[].  All edges are in mMin form. */
  private int addNewNf3Cycles(final Edge e, final Edge[] on3, final int non3) {
    final Edge[] e0 = new Edge[Plantri.MAX_VERTICES];
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    for (int i = non3; --i >= 0; ) {
      ef.markLo(on3[i]);
    }

    mVertexMarks.resetMarksVertex();
    final int v1 = e.mStart;
    int k;
    Edge e1;
    for (e1 = e.mNext.mNext, k = mDegree[v1] - 3; --k >= 0; e1 = e1.mNext) {
      mVertexMarks.markVertex(e1.mEnd);
      e0[e1.mEnd] = e1;
    }

    int j = non3;
    for (e1 = e.mInverse.mNext.mNext, k = mDegree[e.mEnd] - 3; --k >= 0; e1 = e1.mNext) {
      if (mVertexMarks.isMarkedVertex(e1.mEnd)) {
        final Edge e2 = e0[e1.mEnd];

        Edge ee = e.mMin;
        if (!ef.isMarkedLo(ee)) {
          on3[j++] = ee;
          ef.markLo(ee);
        }
        ee = e1.mMin;
        if (!ef.isMarkedLo(ee)) {
          on3[j++] = ee;
          ef.markLo(ee);
        }
        ee = e2.mMin;
        if (!ef.isMarkedLo(ee)) {
          on3[j++] = ee;
          ef.markLo(ee);
        }
      }
    }
    return j;
  }

  /* This is the first procedure that creates nf-3-cycles for minDeg=5
     triangulations.  It is called with a 4-connected triangulation and
     a list of the mMin forms of all the edges which lie on nf-4-cycles.
  */
  private void scanMin5c3X0(final int nbTot) {
    final Edge[] ext5sw = new Edge[Plantri.MAX_EDGES / 2];
    final int next5sw = findExtensionsMin5C3(nbTot, null, 0, ext5sw);
    switchAndScan(new Edge[Plantri.MAX_EDGES], new Edge[Plantri.MAX_EDGES / 2], ext5sw, new MutableInteger(), new MutableInteger(), next5sw);
  }

  /* This is the first procedure that creates nf-3-cycles for minDeg=5
     triangulations.  It is called with a 3-connected triangulation and
     a list of the mMin forms of all the edges which lie on nf-3-cycles.
  */
  private void scanMin5c3X1(final int nbTot, final int nbOp, final Edge[] on3, final int non3) {
    final Edge[] ext5Sw = new Edge[Plantri.MAX_EDGES / 2];
    final int next5Sw = findExtensionsMin5C3(nbTot, on3, non3, ext5Sw);
    if (mPlantri.mPolytopeSwitch) {
      mPlantri.startPolyScan(nbTot, nbOp, mNeedGroup);
    } else {
      mPlantri.gotOne(nbTot, nbOp, 3);
    }
    switchAndScan(new Edge[Plantri.MAX_EDGES], on3, ext5Sw, new MutableInteger(), new MutableInteger(), next5Sw);
  }

  private void switchAndScan(final Edge[] good, final Edge[] on3, final Edge[] ext5sw, final MutableInteger nbTot, final MutableInteger nbOp, final int limit) {
    for (int i = 0; i < limit; ++i) {
      mPlantri.mSwitcher.switchEdge(ext5sw[i]);
      final int non3 = addNewNf3Cycles(ext5sw[i], on3, 0);
      final int nGood = min5C3SwLegal(ext5sw[i], on3, non3, good);
      if (nGood > 0 && Canon.canonEdge(mPlantri, good, nGood, mDegree, mNumbering, nbTot, nbOp)) {
        scanMin5c3X1(nbTot.get(), nbOp.get(), on3, non3);
      }
      mPlantri.mSwitcher.switchEdgeBack(ext5sw[i]);
    }
  }

  /* checks whether the configuration centered at vertex v is reducible by
     the c-reduction of the min5 generation.

     It assumes that there is no nf-4-cycle in the graph. It can be
     shown that it is enough to check the valencies of the center and its
     neighbours to be 5 and the second neighbours to be at least 6. In this
     case a 4-cut introduced by the reduction would imply that there was one
     before.
  */
  protected boolean isMin5CCentre(final int v) {
    if (mDegree[v] != 5) {
      return false;
    }
    Edge run = mFirstEdge[v];
    if (mDegree[run.mEnd] != 5) {
      return false;
    }
    run = run.mNext;
    if (mDegree[run.mEnd] != 5) {
      return false;
    }
    run = run.mNext;
    if (mDegree[run.mEnd] != 5) {
      return false;
    }
    run = run.mNext;
    if (mDegree[run.mEnd] != 5) {
      return false;
    }
    run = run.mNext;
    if (mDegree[run.mEnd] != 5) {
      return false;
    }

    run = run.mInverse.mPrev.mPrev.mInverse.mNext; /* edge 1*/
    if ((mDegree[run.mStart] < 6) || (mDegree[run.mEnd] < 6)) {
      return false;
    }
    run = run.mInverse.mNext.mNext.mNext; /* edge 2*/
    if (mDegree[run.mEnd] < 6) {
      return false;
    }
    run = run.mInverse.mNext.mNext.mNext; /* edge 3*/
    if (mDegree[run.mEnd] < 6) {
      return false;
    }
    run = run.mInverse.mNext.mNext.mNext; /* edge 4*/
    return mDegree[run.mEnd] >= 6;
  }

  /* Returns 1 if after switching e won't be on an nf 4-cycle. Assumes that
     there are no nf 3-cycles either before or after the switching. */
  private boolean wontBeOnNf4Cycle(Edge e) {
    mVertexMarks.resetMarksVertex();
    Edge last = e.mNext.mInverse.mPrev;
    Edge run = last.mNext.mNext.mNext;
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, last);
    e = e.mPrev.mInverse;
    run = e.mNext;
    last = e.mPrev.mPrev;
    Edge dummy = run.mInverse;
    Edge last1 = dummy.mPrev.mPrev;
    Edge run1 = dummy.mNext.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return false;
    }
    run1 = run1.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return false;
    }
    if (mPlantri.checkIfPathMarked(run1, last1)) {
      return false;
    }
    run = run.mNext;
    dummy = run.mInverse;
    last1 = dummy.mPrev.mPrev;
    run1 = dummy.mNext.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return false;
    }
    run1 = run1.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return false;
    }
    if (mPlantri.checkIfPathMarked(run1, last1)) {
      return false;
    }
    while (run != last) {
      run = run.mNext;
      dummy = run.mInverse;
      last1 = dummy.mPrev.mPrev;
      run1 = dummy.mNext.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return false;
      }
      run1 = run1.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return false;
      }
      if (mPlantri.checkIfPathMarked(run1, last1)) {
        return false;
      }
    }
    return true;
  }

  /* The edge e has just been switched.  Previously it was not on any
     nf-4-cycles and on4[0..non4-1] was a list of all edges on nf-4-cycles.
     Add any new nf-4-cycles to on4[].  All edges are in mMin form. */
  private int addNewNf4Cycles(final Edge e, final Edge[] on4, final int non4) {
    final Edge[] e0 = new Edge[Plantri.MAX_VERTICES];
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    for (int i = non4; --i >= 0; ) {
      ef.markLo(on4[i]);
    }

    mVertexMarks.resetMarksVertex();
    final int v1 = e.mStart;
    int k = mDegree[v1] - 3;
    for (Edge e1 = e.mNext.mNext; --k >= 0; e1 = e1.mNext) {
      mVertexMarks.markVertex(e1.mEnd);
      e0[e1.mEnd] = e1;
    }

    int j = non4;
    k = mDegree[e.mEnd] - 3;
    for (Edge e1 = e.mInverse.mNext.mNext; --k >= 0; e1 = e1.mNext) {
      int l = mDegree[e1.mEnd] - 3;
      for (Edge e2 = e1.mInverse.mNext.mNext; --l >= 0; e2 = e2.mNext) {
        if (mVertexMarks.isMarkedVertex(e2.mEnd)) {
          final Edge e3 = e0[e2.mEnd];
          Edge ee = e.mMin;
          if (!ef.isMarkedLo(ee)) {
            on4[j++] = ee;
            ef.markLo(ee);
          }
          ee = e1.mMin;
          if (!ef.isMarkedLo(ee)) {
            on4[j++] = ee;
            ef.markLo(ee);
          }
          ee = e2.mMin;
          if (!ef.isMarkedLo(ee)) {
            on4[j++] = ee;
            ef.markLo(ee);
          }
          ee = e3.mMin;
          if (!ef.isMarkedLo(ee)) {
            on4[j++] = ee;
            ef.markLo(ee);
          }
        }
      }
    }
    return j;
  }

  /* Edge e (mMin form) has been switched (4-connected phase of minDeg=5).
     on4[0..non4-1] are all the edges in nf-4-cycles.
     Put into good[0..nGood-1] edges as desired for canonEdge().
  */
  private int min5C4SwLegal(final Edge e, final Edge[] on4, final int non4, final Edge[] good) {
    int ng;
    int bestcol = bangCol(e);
    int col = bangCol(e.mInverse);
    final int bestcol2 = bangCol2(e);

    if (bestcol > col) {
      good[0] = e;
      ng = 1;
    } else if (bestcol == col) {
      good[0] = e;
      good[1] = e.mInverse;
      ng = 2;
    } else {
      good[0] = e.mInverse;
      ng = 1;
      bestcol = col;
    }

    for (int i = 0; i < non4; ++i) {
      final Edge e1 = on4[i];
      final Edge e2 = e1.mInverse;
      if (mDegree[e1.mStart] >= 6 && mDegree[e1.mEnd] >= 6 && e1 != e && wontBeOnNf4Cycle(e1)) {
        final int col2 = bangCol2(e1);

        col = bangCol(e1);
        if (col > bestcol) {
          return 0;
        } else if (col == bestcol) {
          if (col2 > bestcol2) {
            return 0;
          } else if (col2 == bestcol2) {
            good[ng++] = e1;
          }
        }

        col = bangCol(e2);
        if (col > bestcol) {
          return 0;
        } else if (col == bestcol) {
          if (col2 > bestcol2) {
            return 0;
          } else if (col2 == bestcol2) {
            good[ng++] = e2;
          }
        }
      }
    }
    return ng;
  }

  /* on4[0..non4-1] is a complete list of all (mMin) edges in nf-4-cycles.
     Return true if there is a valid switch-reduction.  Assume no nf-3-cycles.
  */
  private boolean hasMin5C4Sw(final Edge[] on4, final int non4) {
    for (int i = 0; i < non4; ++i) {
      final Edge e = on4[i];
      if (mDegree[e.mStart] >= 6 && mDegree[e.mEnd] >= 6 && wontBeOnNf4Cycle(e)) {
        return true;
      }
    }
    return false;
  }

  /* Checks whether performing a 5-reduction at e (e starting at the
     vertex with valency 5) will produce a configuration with
     one of the diagonals being on an nf-4-cycle. It is assumed
     that it is already assured that a 5-reduction here is possible
     (e.g. degree[e.mStart]=5).

     It somehow simulates the situation after the switch. This is
     a bit ugly, since after the switch on ONE side there will be
     an additional edge and on the other there won't.
  */
  private boolean willBeOnNf4red(Edge e) {
    // It is important for the correctness, that we go ONE step from e and two from e1, resp e2
    final Edge e1 = e.mPrev.mPrev.mInverse;
    final Edge e2 = e.mNext.mNext.mInverse;
    e = e.mInverse;

    mVertexMarks.resetMarksVertex();
    Edge last = e.mPrev; /* there will be an edge in between */
    Edge run = e.mNext.mNext;
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, last);
    last = e1.mPrev.mPrev; /* I cannot reach the edges that will be
                          missing after the reduction in two steps, so
                          here I can proceed "as usual" */
    run = e1.mNext.mNext;
    Edge dummy = run.mInverse;
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

    mVertexMarks.resetMarksVertex();
    last = e.mPrev.mPrev;
    run = e.mNext; /* there will be an edge in between */
    mVertexMarks.markVertex(run.mEnd);
    mPlantri.findEdgeAndMarkPath(run, last);
    last = e2.mPrev.mPrev; /* I cannot reach the edges that will be
                          missing after the reduction in two steps,
                          so here I can proceed "as usual" */
    run = e2.mNext.mNext;
    dummy = run.mInverse;
    return mPlantri.fiveCycle(run, dummy.mNext.mNext, last, dummy.mPrev.mPrev);
  }

  /* Checks whether the edge given is a legal reference edge for a 5-reduction
     in the minimum valency 5 connectivity 4 case, that is:

     (i) e.mStart has degree 5 (note that this way in case of both
          endpoints valency 5 the routine has to be called for e and
          e.mInverse due to the asymmetric behaviour of (iii))
     (ii) The two endpoints of e.mNext, e.mPrev have valency at least 6
     (iii) The two endpoints of e.mNext, e.mPrev have a common neighbour with
           valency 5 different from e.mStart, e.mEnd, so especially
           e.mNext, e.mPrev, e.mInverse.mNext, e.mInverse.mPrev all are on
           nf-4-cycles.
    (iv) after doing the 5-reduction e.mNext.mNext and e.mPrev.mPrev
         will not be on 4-cycles

     Returns 1 in case it is a legal reduction, 0 otherwise. Assumes the
     non-existence of nf-3-cycles.  nf4cycleedges[0..numnf4cycleedges-1]
     are the mMin forms of all edges on nf-4-cycles.
  */
  private boolean legal5Min5Reduction(final Edge e, final Edge[] nf4cycleedges, int numnf4cycleedges) {
    if (mDegree[e.mStart] != 5) {
      return false;
    }
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mEdges);
    for (numnf4cycleedges--; numnf4cycleedges >= 0; --numnf4cycleedges) {
      ef.markLo(nf4cycleedges[numnf4cycleedges]);
    }

    if (!ef.isMarkedLo(e.mNext.mMin) || !ef.isMarkedLo(e.mPrev.mMin)) {
      return false;
    }
    final Edge dummy = e.mInverse;
    return !(!ef.isMarkedLo(dummy.mNext.mMin) || !ef.isMarkedLo(dummy.mPrev.mMin))
      && mMin5C4Finder.common5EndPoint(e.mNext, e.mPrev) && !willBeOnNf4red(e);
  }

  /* e is the reference edge of a min5-5-expansion that has just been done.
     on4[0..non4-1] are the mMin forms of all edges on nf-4-cycles.
     There are no nf-3-cycles.
     Create in good[0..*nGood-1] a list of directed edges in the form
     required by canonEdge().
  */
  private int min5C45Legal(final Edge ref, final Edge[] on4, final int non4, final Edge[] good) {
    int ng = 0;
    if (legal5Min5Reduction(ref, on4, non4)) {
      good[ng++] = ref;
    }
    if (legal5Min5Reduction(ref.mInverse, on4, non4)) {
      good[ng++] = ref.mInverse;
    }

    final int bestdeg = Math.max(mDegree[ref.mStart], mDegree[ref.mEnd]);

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 5) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          if (mDegree[e.mEnd] >= bestdeg && e != ref && e != ref.mInverse && legal5Min5Reduction(e, on4, non4)) {
            if (mDegree[e.mEnd] > bestdeg) {
              return 0;
            } else {
              good[ng++] = e;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }
    return ng;
  }

  /* This is the recursive procedure that creates nf-4-cycles for minDeg=5
     triangulations.  The first call is with a 4-connected triangulation
     made by a single switching from a 5-connected triangulation.
     on4[0..non4-1] are all edges on nf-4-cycles (mMin form).
  */
  private void scanMin5c4X1(final int nbTot, final int nbOp, final Edge[] on4, final int non4) {
    final Edge[] good = new Edge[Plantri.MAX_EDGES];
    final Edge[] ext5Sw = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext551 = new Edge[Plantri.MAX_EDGES];
    final Edge[] ext552 = new Edge[Plantri.MAX_EDGES];
    final MutableInteger next5Sw = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();

    final int next55 = mMin5C4Finder.findExtensions(nbTot, null, 0, on4, non4, ext5Sw, next5Sw, ext551, ext552);

    if (mState.mNumVertices == mPlantri.mMaxNV) {
      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startPolyScan(nbTot, nbOp, mNeedGroup);   // Saves the group!
      } else {
        mPlantri.gotOne(nbTot, nbOp, 4);
      }

      if (mPlantri.getMinConnectivity() < 4 && non4 >= 6) {
        scanMin5c3X0(nbTot);
      }
    }

    for (int i = 0; i < next5Sw.get(); ++i) {
      mPlantri.mSwitcher.switchEdge(ext5Sw[i]);
      final int newnon4 = addNewNf4Cycles(ext5Sw[i], on4, non4);
      final int nGood = min5C4SwLegal(ext5Sw[i], on4, newnon4, good);
      if (nGood > 0 && Canon.canonEdge(mPlantri, good, nGood, mDegree, mNumbering, xnbTot, xnbOp)) {
        scanMin5c4X1(xnbTot.get(), xnbOp.get(), on4, newnon4);
      }
      mPlantri.mSwitcher.switchEdgeBack(ext5Sw[i]);
    }

    for (int i = 0; i < next55; ++i) {
      final Edge extAred = mMin5A.extendMin5A(ext551[i], ext552[i]);
      if (extAred.mStart == mState.mNumVertices - 1) {
        on4[non4] = extAred.mNext.mMin;
        on4[non4 + 1] = extAred.mPrev.mMin;
      } else {
        on4[non4] = extAred.mInverse.mNext.mMin;
        on4[non4 + 1] = extAred.mInverse.mPrev.mMin;
      }
      final int newnon4 = non4 + 2;
      if (!hasMin5C4Sw(on4, newnon4)) {
        final int nGood = min5C45Legal(extAred, on4, newnon4, good);
        if (nGood > 0 && Canon.canonEdge(mPlantri, good, nGood, mDegree, mNumbering, xnbTot, xnbOp)) {
          scanMin5c4X1(xnbTot.get(), xnbOp.get(), on4, newnon4);
        }
      }
      mMin5A.reduceMin5A(extAred);
    }
  }

  /* This is the first procedure that creates nf-4-cycles for minDeg=5
     triangulations.  It is called with a 5-connected triangulation.
     bang[0..nBang-1] are all proper bangles and possibly some improper
     bangles (degree 5 at one or both ends).  For this first step, only
     a switching operation is possible.
  */
  private void scanMin5c4X0(final int nbTot, final Edge[] bang, final int nBang) {
    if (mState.mNumVertices < mPlantri.mSplitLevel && mPlantri.mRes > 0) {
      return;
    }

    final Edge[] good = new Edge[Plantri.MAX_EDGES];
    final Edge[] on4 = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext5sw = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext551 = new Edge[1];
    final Edge[] ext552 = new Edge[1]; // 5-expansion impossible
    final MutableInteger next5sw = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();

    final Edge[] firstEdgeSave = new Edge[Plantri.MAX_VERTICES];
    if (mPlantri.mSplitLevel > 0) {
      System.arraycopy(mFirstEdge, 0, firstEdgeSave, 0, mState.mNumVertices);
    }

    mMin5C4Finder.findExtensions(nbTot, bang, nBang, null, 0, ext5sw, next5sw, ext551, ext552);

    for (int i = 0; i < next5sw.get(); ++i) {
      mPlantri.mSwitcher.switchEdge(ext5sw[i]);
      final int non4 = addNewNf4Cycles(ext5sw[i], on4, 0);
      final int nGood = min5C4SwLegal(ext5sw[i], on4, non4, good);
      if (nGood > 0 && Canon.canonEdge(mPlantri, good, nGood, mDegree, mNumbering, xnbTot, xnbOp)) {
        scanMin5c4X1(xnbTot.get(), xnbOp.get(), on4, non4);
      }
      mPlantri.mSwitcher.switchEdgeBack(ext5sw[i]);
    }

    if (mPlantri.mSplitLevel > 0) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

  /* The main node of the recursion for triangulations with minimum
     degree 5, connectivity 3 or 4.  This part of the recursion makes
     5-connected triangulations.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     If doSplit==true, this is the place to do splitting (if any).
     mPrev[0..nPrevA-1] is the list of consecutive A operations leading
     to this graph, given by their central edges.
     If nPrevA == 0, this graph wasn't made with A.
     bangle[0..nBangles-1] contains the edges which are central
     edges of a bangle.
  */
  void scanMin5(final int nbTot, final int nbOp, final boolean doSplit, final Edge[] prevA, final int nPrevA, final Edge[] bangle, final int nBangles) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startPolyScan(nbTot, nbOp, mNeedGroup);   // Saves the group!
      } else {
        mPlantri.gotOne(nbTot, nbOp, 5);
      }
      if (nBangles > 0) {
        scanMin5c4X0(nbTot, bangle, nBangles);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final MutableInteger nextA = new MutableInteger();
    final MutableInteger nextB = new MutableInteger();
    final MutableInteger nextC = new MutableInteger();
    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final Edge[] extA1 = new Edge[Plantri.MAX_VERTICES * Plantri.MAX_VERTICES / 4 + 10];
    final Edge[] extA2 = new Edge[Plantri.MAX_VERTICES * Plantri.MAX_VERTICES / 4 + 10];
    final Edge[] extB = new Edge[Plantri.MAX_EDGES];
    final Edge[] extC = new Edge[Plantri.MAX_VERTICES];
    final Edge[] extCanchor = new Edge[1];
    final boolean[] extBmirror = new boolean[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newprevA = new Edge[Plantri.MAX_VERTICES];
    final Edge[] newbang = new Edge[Plantri.MAX_EDGES / 2];

    mMin5Finder.findExtensions(nbTot, nbOp, extA1, extA2, nextA, extB, extBmirror, nextB, extC, nextC, nPrevA == 0 ? null : prevA[nPrevA - 1]);

    if (nBangles > 0) {
      scanMin5c4X0(nbTot, bangle, nBangles);
    }

    final int splitLevel = mPlantri.mSplitLevel;
    for (int i = 0; i < nextA.get(); ++i) {
      final Edge extAred = mMin5A.extendMin5A(extA1[i], extA2[i]);
      mMin5A.isLegal(extAred, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, prevA, nPrevA);

      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        int newNBang = 0;
        for (int j = 0; j < nBangles; ++j) {
          if (mPlantri.isIn5Bangle(bangle[j])) {
            newbang[newNBang++] = bangle[j];
          }
        }
        if (mPlantri.isIn5Bangle(extAred)) {
          newbang[newNBang++] = extAred;
        }

        if (mState.mNumVertices == mPlantri.mMaxNV) {
          int k = 0;
          for (int j = 0; j < newNBang; ++j) {
            if (mDegree[newbang[j].mStart] >= 6 && mDegree[newbang[j].mEnd] >= 6) {
              newbang[k++] = newbang[j];
            }
          }
          newNBang = k;
        }

        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get() && ((newNBang == 0 && mPlantri.getMinConnectivity() == 4) || mPlantri.getMinConnectivity() == 5)) {
          mPlantri.gotOne(1, 1, 5);   // Note: -p implies -G
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          prevA[nPrevA] = extAred;
          scanMin5(1, 1, mState.mNumVertices == splitLevel, prevA, nPrevA + 1, newbang, newNBang);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          prevA[nPrevA] = extAred;
          scanMin5(xnbTot.get(), xnbOp.get(), mState.mNumVertices == splitLevel, prevA, nPrevA + 1, newbang, newNBang);
        }
      }
      mMin5A.reduceMin5A(extAred);
    }

    for (int i = 0; i < nextB.get(); ++i) {
      final Edge extBred = extendMin5B(extB[i], extBmirror[i]);
      if (!mMin5A.hasMin5A()) {
        mMin5B.legal(extBred, extBmirror[i], goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef);

        if (nGoodRef.get() + nGoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
            final int newNumBangles = mPlantri.all5Bangles(newbang);
            scanMin5(xnbTot.get(), xnbOp.get(), mState.mNumVertices == splitLevel || mState.mNumVertices == splitLevel + 1, newprevA, 0, newbang, newNumBangles);
          }
        }
      }
      reduceMin5B(extBred, extBmirror[i]);
    }

    final int[] colour = new int[Plantri.MAX_VERTICES];
    for (int i = 0; i < nextC.get(); ++i) {
      final Edge extCred = mMin5C.extend(extC[i], extCanchor);
      if (!mMin5A.hasMin5A() && !hasMin5B()) {
        for (int j = 0; j < mState.mNumVertices - 1; ++j) {
          colour[j] = isMin5CCentre(j) ? 2 : mDegree[j];
        }
        colour[mState.mNumVertices - 1] = 2;

        if (Canon.canon(mPlantri, mFirstEdge, colour, mNumbering, xnbTot, xnbOp)) {
          final int newNumBangles = mPlantri.all5Bangles(newbang);
          scanMin5(xnbTot.get(), xnbOp.get(), mState.mNumVertices >= splitLevel && mState.mNumVertices <= splitLevel + 4, newprevA, 0, newbang, newNumBangles);
        }
      }
      mMin5C.reduce(extCred, extCanchor);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }
}
