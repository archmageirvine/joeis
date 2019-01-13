package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for 3-connected quadrangulations without non-facial 4-cycles.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationNf4Scanner extends QuadrangulationScanner {

  private final QuadrangulationNf4ExtensionFinder mQuadNf4Finder;

  QuadrangulationNf4Scanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    super(plantri, numbering, needGroup);
    mQuadNf4Finder = new QuadrangulationNf4ExtensionFinder(mState, numbering, plantri.mVertexMarks, plantri.mEdgeFactory);
  }

  /* The main node of the recursion for 3-connected quadrangulations
     without non-facial 4-cycles.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     If spoke!=null the input is a pseudo-double wheel and this is a
     spoke from the rim towards the hub.
     If doSplit==true, this is the place to do splitting (if any).
     Splitting is a bit more complicated because the P operation adds
     two vertices.
     p1edge[0..nP1edges-1] are edges of the graph that were reference
     edges for P1-operations in ancestors of this graph.  They may not
     be reference edges for P1-reductions now, but at least they are edges.
     However, if nP1edges>0, we can say that certainly p1edge[nP1edges-1]
     is a P1-operation that was just done.
  */
  @Override
  void scan(final int nbTot, final int nbOp, final Edge spoke, final boolean doSplit, final Edge[] p1edge, final int nP1edges) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      mPlantri.gotOne(nbTot, nbOp, 4);   // Note connectivity is really 3
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final Edge[] extP1 = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newP1Edge = new Edge[Plantri.MAX_VERTICES];
    final int nextP1 = mQuadNf4Finder.findExtensions(nbTot, extP1, nP1edges == 0 ? null : p1edge[nP1edges - 1]);

    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final int splitLevel = mPlantri.mSplitLevel;
    if (spoke != null && mState.mNumVertices <= mPlantri.mMaxNV - 2) {
      final Edge rededge = mQuadrP2.extend(spoke);
      Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp);
      scan(xnbTot.get(), xnbOp.get(), spoke, mState.mNumVertices == splitLevel || mState.mNumVertices == splitLevel + 1, newP1Edge, 0);
      mQuadrP2.reduce(rededge);
    }

    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    final Edge[] hint = new Edge[1];
    for (int i = 0; i < nextP1; ++i) {
      final Edge rededge = mQuadrP1.extend(extP1[i]);
      quadrP1LegalNf4(rededge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, p1edge, nP1edges, hint);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 4);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          p1edge[nP1edges] = rededge;
          scan(1, 1, null, mState.mNumVertices == splitLevel, p1edge, nP1edges + 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          p1edge[nP1edges] = rededge;
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == splitLevel, p1edge, nP1edges + 1);
        }
      }
      mQuadrP1.reduce(rededge);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }



  /* The P1-operation with reference edge *ref has just been performed.
     prevP1[0..nprevP1-1] are all earlier P1s since the last P2 or P3.
     hint (unless it is null) is a suggestion for a P1-reduction that
     might be better than ref.
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

     Version for 3-connected quadrangulations without non-facial 4-cycles.
  */
  private void quadrP1LegalNf4(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                      final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef,
                                      final Edge[] prevP1, final int nprevP1, final Edge[] hint) {
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

    Edge e = hint[0];
    if (e != null && mDegree[e.mStart] == 3 && mDegree[e.mEnd] > maxdeg && mDegree[e.mNext.mEnd] >= 4 && mDegree[e.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e.mInverse) && P1Legal.legalP1ReductionNf4(mDegree, mVertexMarks, e)) {
      if (mDegree[e.mEnd] > maxdeg) {
        nGoodRef.set(0);
        nGoodMirRef.set(0);
        return;
      } else {
        col = qorcol(e);
        if (col > maxcol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxcol) {
          goodOr[nor++] = e;
        }

        col = qmircol(e);
        if (col > maxcol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxcol) {
          goodMir[nmir++] = e;
        }
      }
      ef.markLo(e.mInverse);
    }

    for (int i = nprevP1; --i >= 0; ) {
      e = prevP1[i];
      if (mDegree[e.mEnd] >= maxdeg && mDegree[e.mStart] == 3 && mDegree[e.mNext.mEnd] >= 4 && mDegree[e.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e.mInverse) && P1Legal.legalP1ReductionNf4(mDegree, mVertexMarks, e)) {
        if (mDegree[e.mEnd] > maxdeg) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else {
          col = qorcol(e);
          if (col > maxcol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxcol) {
            goodOr[nor++] = e;
          }

          col = qmircol(e);
          if (col > maxcol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxcol) {
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
      if (mDegree[i] > maxdeg) {
        final Edge eLast = mFirstEdge[i];
        e = eLast;
        do {
          if (mDegree[e.mEnd] == 3 && !ef.isMarkedLo(e)) {
            final Edge ee = e.mInverse;
            if (mDegree[ee.mNext.mEnd] >= 4 && mDegree[ee.mPrev.mEnd] >= 4 && P1Legal.legalP1ReductionNf4(mDegree, mVertexMarks, ee)) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            }
          }
          e = e.mNext;
        } while (e != eLast);
      } else if (mDegree[i] == maxdeg) {
        final Edge eLast = mFirstEdge[i];
        e = eLast;
        do {
          final Edge ee = e.mInverse;
          if (mDegree[e.mEnd] == 3 && mDegree[ee.mNext.mEnd] >= 4 && mDegree[ee.mPrev.mEnd] >= 4 && !ef.isMarkedLo(e) && P1Legal.legalP1ReductionNf4(mDegree, mVertexMarks, ee)) {
            col = qorcol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            } else if (col == maxcol) {
              goodOr[nor++] = e.mInverse;
            }

            col = qmircol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
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
}
