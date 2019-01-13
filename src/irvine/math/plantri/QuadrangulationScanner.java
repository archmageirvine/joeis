package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for 3-connected quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationScanner {

  protected final Plantri mPlantri;
  protected final PlantriGraphState mState;
  protected final int[] mDegree;
  protected final Edge[] mFirstEdge;
  protected final Numbering mNumbering;
  protected final Marks mVertexMarks;
  protected final QuadrangulationP1ExtenderReducer mQuadrP1;
  protected final ExtenderReducer mQuadrP2;
  protected final QuadrangulationP3ExtenderReducer mQuadrP3;
  private final QuadrangulationExtensionFinder mQuadFinder;
  private final LegalReduction mP3LegalReduction;
  protected final boolean mNeedGroup;

  QuadrangulationScanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = plantri.mVertexMarks;
    mQuadrP1 = new QuadrangulationP1ExtenderReducer(mState, plantri.mEdgeFactory);
    mQuadrP2 = new QuadrangulationP2ExtenderReducer(mState);
    mQuadrP3 = new QuadrangulationP3ExtenderReducer(mState, plantri.mEdgeFactory);
    mQuadFinder = new QuadrangulationExtensionFinder(plantri, mNumbering, mVertexMarks);
    mP3LegalReduction = new P3LegalReduction(mDegree);
    mNeedGroup = needGroup;
  }

  protected int qorcol(final Edge e) {
    return (mDegree[e.mPrev.mEnd] << 10) + mDegree[e.mNext.mEnd];
  }

  protected int qmircol(final Edge e) {
    return (mDegree[e.mNext.mEnd] << 10) + mDegree[e.mPrev.mEnd];
  }

  /* Test whether there is a legal P1 reduction */
  protected boolean hasQuadrP0() {
    for (int i = mState.mNumVertices; --i >= 0; ) {
      if (mDegree[i] == 2) {
        return true;
      }
    }
    return false;
  }

  /* Test whether there is a legal P1 reduction */
  private boolean hasQuadrP1() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 3) {
        final Edge eLast = mFirstEdge[i];
        Edge e = eLast;
        do {
          if (mDegree[e.mNext.mEnd] >= 4 && mDegree[e.mPrev.mEnd] >= 4 && P1Legal.isLegalP1Reduction(e)) {
            return true;
          }
          e = e.mNext;
        } while (e != eLast);
      }
    }
    return false;
  }


  /* Test whether there is a legal P1 reduction, minDeg3 version.
     It is enough that there is a vertex of degree 3 with at least
     two neighbours of degree at least 4.
  */
  protected boolean hasQuadrP1Min3() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 3) {
        Edge e = mFirstEdge[i];
        int n3 = 0;
        if (mDegree[e.mEnd] == 3) {
          ++n3;
        }
        e = e.mNext;
        if (mDegree[e.mEnd] == 3) {
          ++n3;
        }
        e = e.mNext;
        if (mDegree[e.mEnd] == 3) {
          ++n3;
        }
        if (n3 <= 1) {
          return true;
        }
      }
    }
    return false;
  }

  /* The main node of the recursion for 3-connected quadrangulations.
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
 void scan(final int nbTot, final int nbOp, final Edge spoke, final boolean doSplit, final Edge[] p1edge, final int nP1edges) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startBipScan(nbTot, nbOp, 3); // Huh? How is this even possible, cannot have both -p and -q
      } else {
        mPlantri.gotOne(nbTot, nbOp, 3);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final Edge[] extP1 = new Edge[Plantri.MAX_EDGES];
    final Edge[] extP3 = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    final MutableInteger nextP1 = new MutableInteger();
    final MutableInteger nextP3 = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final Edge[] newP1Edge = new Edge[Plantri.MAX_VERTICES];
    final Edge[] hint = new Edge[1];

    mQuadFinder.findExtensions(nbTot, nbOp, extP1, nextP1, extP3, nextP3, nP1edges == 0 ? null : p1edge[nP1edges - 1]);

   final int sSplitLevel = mPlantri.mSplitLevel;
    if (spoke != null && mState.mNumVertices <= mPlantri.mMaxNV - 2) {
      final Edge redEdge = mQuadrP2.extend(spoke);
      Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp);
      scan(xnbTot.get(), xnbOp.get(), spoke, mState.mNumVertices == sSplitLevel || mState.mNumVertices == sSplitLevel + 1, newP1Edge, 0);
      mQuadrP2.reduce(redEdge);
    }

    for (int i = 0; i < nextP1.get(); ++i) {
      final Edge redEdge = mQuadrP1.extend(extP1[i]);
      mQuadrP1.legal(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, p1edge, nP1edges, hint);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 3);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          p1edge[nP1edges] = redEdge;
          scan(1, 1, null, mState.mNumVertices == sSplitLevel, p1edge, nP1edges + 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          p1edge[nP1edges] = redEdge;
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == sSplitLevel, p1edge, nP1edges + 1);
        }
      }
      mQuadrP1.reduce(redEdge);
    }

    for (int i = 0; i < nextP3.get(); ++i) {
      final Edge redEdge = mQuadrP3.extend(extP3[i]);
      if (!hasQuadrP1()) {
        mQuadrP3.legal(redEdge, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mP3LegalReduction);
        if (nGoodRef.get() + nGoodMirRef.get() > 0 && Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
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
