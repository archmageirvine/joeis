package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for general simple quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationAllScanner extends QuadrangulationScanner {

  private final QuadrangulationConnectivity mQuadConnectivity;
  private final QuadrangulationAllExtensionFinder mQuadAllFinder;
  protected final ExtenderReducer mQuadrP0;

  QuadrangulationAllScanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    super(plantri, numbering, needGroup);
    mQuadConnectivity = new QuadrangulationConnectivity(mState, plantri.mEdgeFactory);
    mQuadAllFinder = new QuadrangulationAllExtensionFinder(mState, mNumbering, plantri.mEdgeFactory);
    mQuadrP0 = new QuadrangulationP0ExtenderReducer(mState);
  }

  private static int vcolpd(final int di, final int dj) {
    return di < dj ? (dj << 10) + di : (di << 10) + dj;
  }

  /* The P1-operation with reference edge *ref has just been performed.
     Make a list in goodOr[0..nGoodOr-1] of the reference edges of
     legal P1-reductions (oriented editions) that might be canonical,
     with the first *nGoodRef of those being ref.
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
     mEnd vertex and two side vertices.  It cannot be changed without
     changing findExtensions too.

     version for general quadrangulations
     assumes no vertices of degree 2
  */
  private void quadrP1LegalAll(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                      final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    ef.resetMarks(mState.mEdges);
    int nor = 0;
    int nmir = 0;

    final int maxdeg = mDegree[ref.mEnd];
    int maxcol = qorcol(ref);
    int col = qmircol(ref);
    if (col < maxcol) {
      goodOr[nor++] = ref;
    } else if (col == maxcol) {
      goodOr[nor++] = ref;
      goodMir[nmir++] = ref;
    } else {
      maxcol = col;
      goodMir[nmir++] = ref;
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    ef.markLo(ref.mInverse);

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
      if (mDegree[i] > maxdeg) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          if (mDegree[e.mEnd] == 3 && !ef.isMarkedLo(e)) {
            final Edge ee = e.mInverse;
            if (P1Legal.isLegalP1ReductionAll(ee)) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              return;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      } else if (mDegree[i] == maxdeg) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          final Edge ee = e.mInverse;
          if (mDegree[e.mEnd] == 3 && !ef.isMarkedLo(e) && P1Legal.isLegalP1ReductionAll(ee)) {
            col = qorcol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              return;
            } else if (col == maxcol) {
              goodOr[nor++] = e.mInverse;
            }

            col = qmircol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              return;
            } else if (col == maxcol) {
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

  /* The P0-operation with reference edge *ref has just been performed.
   Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
   legal P1-reductions (oriented editions) that might be canonical,
   with the first *nGoodRef of those being ref.
   Make a list in goodMir[0..*nGoodMir-1] of the
   reference edges of legal four-reductions (mirror-image editions)
   that might be canonical, with the first *nGoodMirRef of those being
   ref.mNext.
   *nGoodRef and *nGoodMirRef might each be 0-1.  If they are
   both 0, nothing else need be correct.
   All the edges in goodOr[] and goodMir[] must mStart with the same
   vertex degree and mEnd with the same vertex degree (actually, colour
   as passed to canonEdgeOriented).
   P1-reductions have a priority (colour) based on the degrees of the
   mEnd vertex and two side vertices.  It cannot be changed without
   changing findExtensions too.

   version for general quadrangulations
  */
  private void quadrP0LegalAll(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                      final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    int nor = 0;
    int nmir = 0;

    int d1 = mDegree[ref.mEnd];
    int d2 = mDegree[ref.mNext.mEnd];
    int d3 = mDegree[ref.mInverse.mNext.mEnd];
    int d4 = mDegree[ref.mInverse.mPrev.mEnd];

    final int maxcol = vcolpd(d1, d2);
    final int maxcol2 = vcolpd(d3, d4);

    if (d1 >= d2) {
      if (d3 >= d4) {
        goodOr[nor++] = ref;
      }
      if (d4 >= d3) {
        goodMir[nmir++] = ref;
      }
    }
    if (d2 >= d1) {
      if (d4 >= d3) {
        goodOr[nor++] = ref.mNext;
      }
      if (d3 >= d4) {
        goodMir[nmir++] = ref.mNext;
      }
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    for (int i = mState.mNumVertices - 1; --i >= 0; ) {
      if (mDegree[i] == 2) {
        final Edge e = mFirstEdge[i];
        d1 = mDegree[e.mEnd];
        d2 = mDegree[e.mNext.mEnd];
        final int col = vcolpd(d1, d2);
        if (col > maxcol) {
          nGoodRef.set(nor);
          nGoodMirRef.set(nmir);
          return;
        } else if (col == maxcol) {
          d3 = mDegree[e.mInverse.mNext.mEnd];
          d4 = mDegree[e.mInverse.mPrev.mEnd];
          final int col2 = vcolpd(d3, d4);

          if (col2 > maxcol2) {
            nGoodRef.set(nor);
            nGoodMirRef.set(nmir);
            return;
          } else if (col2 == maxcol2) {
            if (d1 >= d2) {
              if (d3 >= d4) {
                goodOr[nor++] = e;
              }
              if (d4 >= d3) {
                goodMir[nmir++] = e;
              }
            }
            if (d2 >= d1) {
              if (d4 >= d3) {
                goodOr[nor++] = e.mNext;
              }
              if (d3 >= d4) {
                goodMir[nmir++] = e.mNext;
              }
            }
          }
        }
      }
    }

    nGoodOr.set(nor);
    nGoodMir.set(nmir);
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      Pruner.pruneOrientedLists(goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mDegree);
    }
  }

  /* The main node of the recursion for general simple quadrangulations.
   As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
   and nbTot/nbOp are the values returned by canon() for that graph.
  */
  void scanQuadrangulationsAll(final int nbTot, final int nbOp) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      final int conn;
      if (mPlantri.mPolytopeSwitch || mPlantri.mExactSwitch) {
        conn = mQuadConnectivity.isConnected();
      } else {
        conn = 2;           /* really 2 or 3 */
      }

      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startBipScan(nbTot, nbOp, conn);
      } else {
        mPlantri.gotOne(nbTot, nbOp, conn);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(mState.mNumVertices == mPlantri.mSplitLevel);
    if (firstEdgeSave == null) {
      return;
    }

    final Edge[] extP0 = new Edge[Plantri.MAX_EDGES];
    final Edge[] extP1 = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final MutableInteger nextP0 = new MutableInteger();
    final MutableInteger nextP1 = new MutableInteger();

    mQuadAllFinder.findExtensions(nbTot, nbOp, extP0, nextP0, extP1, nextP1);

    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();

    for (int i = 0; i < nextP0.get(); ++i) {
      final Edge redEdge = mQuadrP0.extend(extP0[i]);
      quadrP0LegalAll(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 2);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          scanQuadrangulationsAll(1, 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          scanQuadrangulationsAll(xnbTot.get(), xnbOp.get());
        }
      }
      mQuadrP0.reduce(redEdge);
    }

    for (int i = 0; i < nextP1.get(); ++i) {
      final Edge redEdge = mQuadrP1.extend(extP1[i]);
      if (!hasQuadrP0()) {
        quadrP1LegalAll(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef);
        if (nGoodRef.get() + nGoodMirRef.get() > 0 && Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          scanQuadrangulationsAll(xnbTot.get(), xnbOp.get());
        }
      }
      mQuadrP1.reduce(redEdge);
    }

    if (mState.mNumVertices == mPlantri.mSplitLevel) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

}
