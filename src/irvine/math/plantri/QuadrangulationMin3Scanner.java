package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for 3-connected quadrangulations or minimum degree 3.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationMin3Scanner extends QuadrangulationScanner {

  private final QuadrangulationMin3ExtensionFinder mQuadMin3Finder;
  private final QuadrangulationConnectivity mQuadConnectivity;
  private final LegalReduction mP3MinLegalReduction;

  QuadrangulationMin3Scanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    super(plantri, numbering, needGroup);
    mQuadMin3Finder = new QuadrangulationMin3ExtensionFinder(plantri, mNumbering, plantri.mVertexMarks);
    mQuadConnectivity = new QuadrangulationConnectivity(mState, plantri.mEdgeFactory);
    mP3MinLegalReduction = new P3MinLegalReduction(mDegree);
  }

  /* The P1-operation with reference edge ref has just been performed.
     prevP1[0..nPrevP1-1] are all earlier P1s since the last P2 or P3.
     hint (unless it is null) is a suggestion for a P1-reduction that
     might be better than ref.
     Make a list in goodOr[0..nGoodOr-1] of the reference edges of
     legal P1-reductions (oriented editions) that might be canonical,
     with the first nGoodRef of those being ref.
     Make a list in goodMir[0..nGoodMir-1] of the
     reference edges of legal four-reductions (mirror-image editions)
     that might be canonical, with the first nGoodMirRef of those being
     ref.mNext.
     nGoodRef and nGoodMirRef might each be 0-1.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).
     P1-reductions have a priority (colour) based on the degrees of the
     end vertex and two side vertices.  It cannot be changed without
     changing findExtensions too.

     minDeg 3 version
  */
  private void quadrP1LegalMin3(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                       final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef,
                                       final Edge[] prevP1, final int nPrevP1, final Edge[] hint) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mState.mEdges);
    int nor = 0;
    int nmir = 0;

    final int maxDeg = mDegree[ref.mEnd];
    int maxCol = qorcol(ref);
    int col = qmircol(ref);
    if (col < maxCol) {
      goodOr[nor++] = ref;
    } else if (col == maxCol) {
      goodOr[nor++] = ref;
      goodMir[nmir++] = ref;
    } else {
      maxCol = col;
      goodMir[nmir++] = ref;
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    ef.markLo(ref.mInverse);

    Edge e = hint[0];
    if (e != null && mDegree[e.mStart] == 3 && mDegree[e.mEnd] > maxDeg && mDegree[e.mNext.mEnd] >= 4 && mDegree[e.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e.mInverse) && P1Legal.isLegalP1ReductionMin3(e)) {
      if (mDegree[e.mEnd] > maxDeg) {
        nGoodRef.set(0);
        nGoodMirRef.set(0);
        return;
      } else {
        col = qorcol(e);
        if (col > maxCol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxCol) {
          goodOr[nor++] = e;
        }

        col = qmircol(e);
        if (col > maxCol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxCol) {
          goodMir[nmir++] = e;
        }
      }
      ef.markLo(e.mInverse);
    }

    for (int i = nPrevP1; --i >= 0; ) {
      e = prevP1[i];
      if (mDegree[e.mEnd] >= maxDeg && mDegree[e.mStart] == 3 && mDegree[e.mNext.mEnd] >= 4 && mDegree[e.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e.mInverse) && P1Legal.isLegalP1ReductionMin3(e)) {
        if (mDegree[e.mEnd] > maxDeg) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else {
          col = qorcol(e);
          if (col > maxCol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxCol) {
            goodOr[nor++] = e;
          }

          col = qmircol(e);
          if (col > maxCol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxCol) {
            goodMir[nmir++] = e;
          }
        }
      }
      ef.markLo(e.mInverse);
    }

    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      final MutableInteger qnor = new MutableInteger(nor);
      final MutableInteger qnmir = new MutableInteger(nmir);
      Pruner.pruneOrientedLists(goodOr, qnor, nGoodRef, goodMir, qnmir, nGoodMirRef, mDegree);
      nor = qnor.get();
      nmir = qnmir.get();
    }
    if (nGoodRef.get() == 0 && nGoodMirRef.get() == 0) {
      return;
    }

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] > maxDeg) {
        final Edge eLast = mFirstEdge[i];
        e = eLast;
        do {
          if (mDegree[e.mEnd] == 3 && !ef.isMarkedLo(e)) {
            final Edge ee = e.mInverse;
            if (mDegree[ee.mNext.mEnd] >= 4 && mDegree[ee.mPrev.mEnd] >= 4 && P1Legal.isLegalP1ReductionMin3(ee)) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      } else if (mDegree[i] == maxDeg) {
        final Edge eLast = mFirstEdge[i];
        e = eLast;
        do {
          final Edge ee = e.mInverse;
          if (mDegree[e.mEnd] == 3 && mDegree[ee.mNext.mEnd] >= 4 && mDegree[ee.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e) && P1Legal.isLegalP1ReductionMin3(ee)) {
            col = qorcol(e.mInverse);
            if (col > maxCol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            } else if (col == maxCol) {
              goodOr[nor++] = e.mInverse;
            }

            col = qmircol(e.mInverse);
            if (col > maxCol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            } else if (col == maxCol) {
              goodMir[nmir++] = e.mInverse;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }

    nGoodOr.set(nor);
    nGoodMir.set(nmir);
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      Pruner.pruneOrientedLists(goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mDegree);
    }
  }

  /* The main node of the recursion for quadrangulations of minDeg 3.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     If spoke!=null the input is a pseudo-double wheel and this is a
     spoke from the rim towards the hub.
     If doSplit==true, this is the place to do splitting (if any).
     Splitting is a bit more complicated because the P operation adds
     two vertices.
     P1edge[0..nP1Edges-1] are edges of the graph that were reference
     edges for P1-operations in ancestors of this graph.  They may not
     be reference edges for P1-reductions now, but at least they are edges.
     However, if nP1Edges>0, we can say that certainly P1edge[nP1Edges-1]
     is a P1-operation that was just done.
  */
  @Override
  void scan(final int nbTot, final int nbOp, final Edge spoke, final boolean doSplit, final Edge[] p1Edge, final int nP1Edges) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      final int conn;
      if (mPlantri.mPolytopeSwitch || mPlantri.mExactSwitch) {
        conn = mQuadConnectivity.isConnected();
      } else {
        conn = 2;           // really 2 or 3
      }

      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startBipScan(nbTot, nbOp, conn);
      } else {
        mPlantri.gotOne(nbTot, nbOp, conn);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final MutableInteger nextP1 = new MutableInteger();
    final MutableInteger nextP3 = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final Edge[] extP1 = new Edge[Plantri.MAX_EDGES];
    final Edge[] extP3 = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newP1Edge = new Edge[Plantri.MAX_VERTICES];
    final Edge[] hint = new Edge[1];

    mQuadMin3Finder.findExtensions(nbTot, nbOp, extP1, nextP1, extP3, nextP3, nP1Edges == 0 ? null : p1Edge[nP1Edges - 1]);

    final int sSplitLevel = mPlantri.mSplitLevel;
    if (spoke != null && mState.mNumVertices <= mPlantri.mMaxNV - 2) {
      final Edge redEdge = mQuadrP2.extend(spoke);
      Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp);
      scan(xnbTot.get(), xnbOp.get(), spoke, mState.mNumVertices == sSplitLevel || mState.mNumVertices == sSplitLevel + 1, newP1Edge, 0);
      mQuadrP2.reduce(redEdge);
    }

    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    for (int i = 0; i < nextP1.get(); ++i) {
      final Edge redEdge = mQuadrP1.extend(extP1[i]);
      quadrP1LegalMin3(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, p1Edge, nP1Edges, hint);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 3);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          p1Edge[nP1Edges] = redEdge;
          scan(1, 1, null, mState.mNumVertices == sSplitLevel, p1Edge, nP1Edges + 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          p1Edge[nP1Edges] = redEdge;
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == sSplitLevel, p1Edge, nP1Edges + 1);
        }
      }
      mQuadrP1.reduce(redEdge);
    }

    for (int i = 0; i < nextP3.get(); ++i) {
      final Edge redEdge = mQuadrP3.extend(extP3[i]);
      if (!hasQuadrP1Min3()) {
        mQuadrP3.legal(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mP3MinLegalReduction);
        if (nGoodRef.get() + nGoodMirRef.get() > 0
          && Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices >= sSplitLevel && mState.mNumVertices <= sSplitLevel + 3, newP1Edge, 0);
        }
      }
      mQuadrP3.reduce(redEdge);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

}
