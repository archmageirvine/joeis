package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for bipartite triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class BipartiteScanner {

  protected final Plantri mPlantri;
  protected final PlantriGraphState mState;
  protected final int[] mDegree;
  protected final Edge[] mFirstEdge;
  protected final Numbering mNumbering;
  protected final BipartitePExtenderReducer mBipP;
  protected final BipartiteQExtenderReducer mBipQ;
  protected final BipExtensionFinder mBipFinder;
  protected final boolean mNeedGroup;

  BipartiteScanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mBipP = new BipartitePExtenderReducer(mState);
    mBipQ = new BipartiteQExtenderReducer(mState);
    mBipFinder = new BipExtensionFinder(plantri, mNumbering);
    mNeedGroup = needGroup;
  }

  /* If the graph has a legal P-reduction return an example; otherwise return null. */
  protected Edge hasBipP() {
    Edge e1 = null;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] == 4) {
        Edge e = mFirstEdge[i];
        int j = 0;
        for (int k = 0; k < 4; ++k, e = e.mNext) {
          if (mDegree[e.mEnd] == 4) {
            e1 = e;
            ++j;
          }
        }
        if (j != 1) {
          continue;
        }

        e = e1.mNext.mNext;

        final int w = e.mEnd;
        final int z = e1.mInverse.mNext.mNext.mEnd;

        if (mDegree[z] != 4) {
          final Edge ezlast = mFirstEdge[z];
          Edge ez = ezlast;
          do {
            if (ez.mEnd == w) {
              break;
            }
            ez = ez.mNext;
          } while (ez != ezlast);
          if (ez.mEnd == w) {
            continue;
          }
        }
        return e;
      }
    }
    return null;
  }

  /* The main node of the recursion for bipartite triangulations
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     If wheelRim != null, the input is a double wheel and *wheelRim is
     one of the edges on the rim.
     If doSplit==true, this is the place to do splitting (if any).
     Splitting is a bit more complicated because the P operation adds
     two vertices.
     pEdges[0..nPedges-1] are edges of the graph that were reference
     edges for P-operations in ancestors of this graph.  They may not
     be reference edges for P-reductions now, but at least they are edges.
     However, if nPedges>0, we can say that certainly pEdges[nPedges-1]
     is a P-operation that was just done.
  */
  void scan(final int nbTot, final int nbOp, final Edge wheelRim, final boolean doSplit, final Edge[] pEdges, final int nPedges) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      mPlantri.gotOne(nbTot, nbOp, 3);
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final MutableInteger nextP = new MutableInteger();
    final MutableInteger nextQ = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();

    final Edge[] extP = new Edge[Plantri.MAX_EDGES];
    final Edge[] extQ = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newPedges = new Edge[Plantri.MAX_VERTICES / 2];

    mBipFinder.findExtensions(nbTot, nbOp, extP, nextP, extQ, nextQ, pEdges, nPedges);
    final int splitLevel = mPlantri.mSplitLevel;
    if (wheelRim != null && mState.mNumVertices <= mPlantri.mMaxNV - 2) {
      mBipP.extend(wheelRim);
      Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp);
      scan(xnbTot.get(), xnbOp.get(), wheelRim, mState.mNumVertices == splitLevel || mState.mNumVertices == splitLevel + 1, pEdges, 0);
      mBipP.reduce(wheelRim);
    }

    for (int i = 0; i < nextP.get(); ++i) {
      mBipP.extend(extP[i]);
      mBipP.legal(extP[i], goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, nPedges != 0 ? pEdges[nPedges - 1] : null);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 3);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          pEdges[nPedges] = extP[i];
          scan(1, 1, null, mState.mNumVertices == splitLevel || mState.mNumVertices == splitLevel + 1, pEdges, nPedges + 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          pEdges[nPedges] = extP[i];
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == splitLevel || mState.mNumVertices == splitLevel + 1, pEdges, nPedges + 1);
        }
      }
      mBipP.reduce(extP[i]);
    }

    Edge hint = null;
    for (int i = 0; i < nextQ.get(); ++i) {
      mBipQ.extend(extQ[i]);
      if (hint == null || !mBipFinder.isBipP(hint)) {
        hint = hasBipP();
      }

      if (hint == null) {
        mBipQ.legal(extQ[i], goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef);
        if (nGoodRef.get() + nGoodMirRef.get() > 0
          && Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == splitLevel, newPedges, 0);
        }
      }
      mBipQ.reduce(extQ[i]);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

}
