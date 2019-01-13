package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for bipartite triangulations with monitoring of non-facial triangles.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Bipartite4CScanner extends BipartiteScanner {

  Bipartite4CScanner(final Plantri plantri, final Numbering numbering, final boolean needGroup) {
    super(plantri, numbering, needGroup);
  }

  /* Make new list of non-facial triangles after a P-extension. */
  private int updateNftP(final Triangle[] nft, final int numNft, final Edge ref, final Triangle[] newNft) {
    final Edge refmin = ref.mMin;

    // Remove triangles that include ref
    int k = 0;
    for (int i = 0; i < numNft; ++i) {
      if (nft[i].mEdge1 != refmin && nft[i].mEdge2 != refmin && nft[i].mEdge3 != refmin) {
        newNft[k++] = nft[i];
      }
    }

    /* Add new nfts formed by a shortcut if present.  There must be at
     least two nfts already for this to be possible. */
    if (k >= 2) {
      final int w = ref.mNext.mEnd;
      final Edge eLast = ref.mInverse.mNext.mInverse;
      Edge e;
      for (e = eLast.mNext.mNext.mNext.mNext; e != eLast; e = e.mNext) {
        if (e.mEnd == w) {
          break;
        }
      }
      if (e != eLast) {
        newNft[k].mEdge1 = e.mMin;
        newNft[k].mEdge2 = ref.mPrev.mMin;
        newNft[k].mEdge3 = ref.mNext.mMin;
        newNft[k + 1].mEdge1 = e.mMin;
        newNft[k + 1].mEdge2 = ref.mNext.mNext.mInverse.mPrev.mMin;
        newNft[k + 1].mEdge3 = ref.mNext.mNext.mInverse.mNext.mMin;
        k += 2;
      }
    }
    return k;
  }


  /* Make new list of non-facial triangles after a Q-extension. */
  private int updateNftQ(final Triangle[] nft, final int numNft, final Edge ref, final Triangle[] newNft) {
    final Edge refmin1 = ref.mMin;
    final Edge refmin2 = ref.mNext.mMin;

    // Remove triangles that include ref or ref.mNext
    int k = 0;
    for (int i = 0; i < numNft; ++i) {
      if (nft[i].mEdge1 != refmin1 && nft[i].mEdge2 != refmin1
        && nft[i].mEdge3 != refmin1 && nft[i].mEdge1 != refmin2
        && nft[i].mEdge2 != refmin2 && nft[i].mEdge3 != refmin2) {
        newNft[k++] = nft[i];
      }
    }

    // Add new nft through ref if present
    int w = ref.mEnd;
    Edge eLast = ref.mNext.mNext.mInverse.mPrev.mPrev;
    Edge e;
    for (e = eLast.mNext.mNext.mNext.mNext; e != eLast; e = e.mNext) {
      if (e.mEnd == w) {
        break;
      }
    }
    if (e != eLast) {
      newNft[k].mEdge1 = e.mMin;
      newNft[k].mEdge2 = ref.mMin;
      newNft[k++].mEdge3 = ref.mNext.mNext.mMin;
    }

    // Add new nft through ref.mNext if present
    w = ref.mNext.mEnd;
    eLast = ref.mInverse.mNext.mInverse;
    for (e = eLast.mNext.mNext.mNext.mNext; e != eLast; e = e.mNext) {
      if (e.mEnd == w) {
        break;
      }
    }
    if (e != eLast) {
      newNft[k].mEdge1 = e.mMin;
      newNft[k].mEdge2 = ref.mNext.mMin;
      newNft[k++].mEdge3 = ref.mPrev.mMin;
    }

    /* Add all new nft's through the shortcut.  This is the only place
     an nft can be made where there was none before.  This code can
     also add extra nfts through ref or ref.mNext, since v can be
     ref.mEnd or ref.mNext.mEnd. */
    w = ref.mPrev.mEnd;
    eLast = ref.mNext.mNext.mInverse.mPrev.mPrev;
    for (e = eLast.mNext.mNext.mNext; e != eLast; e = e.mNext) {
      //final int v = e.mEnd;
      final Edge flast = e.mInverse;
      Edge f;
      for (f = flast.mNext; f != flast; f = f.mNext) {
        if (f.mEnd == w) {
          break;
        }
      }
      if (f != flast) {
        newNft[k].mEdge1 = eLast.mNext.mMin;
        newNft[k].mEdge2 = e.mMin;
        newNft[k++].mEdge3 = f.mMin;
      }
    }
    return k;
  }

  /* Remove from extP[0..*nextP-1] those extensions which do not
     hit all of nft[0..numNft-1]. */
  private void bipNftLastStep(final Edge[] extP, final MutableInteger nextP, final Triangle[] nft, final int numNft) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    for (int j = 0; j < numNft; ++j) {
      ef.resetMarks(mState.mEdges);
      ef.markLo(nft[j].mEdge1);
      ef.markLo(nft[j].mEdge1.mInverse);
      ef.markLo(nft[j].mEdge2);
      ef.markLo(nft[j].mEdge2.mInverse);
      ef.markLo(nft[j].mEdge3);
      ef.markLo(nft[j].mEdge3.mInverse);

      int k = 0;
      for (int i = 0; i < nextP.get(); ++i) {
        if (ef.isMarkedLo(extP[i])) {
          extP[k++] = extP[i];
        }
      }
      nextP.set(k);
    }
  }

  /* The main node of the recursion for bipartite triangulations with
   monitoring of non-facial triangles.
   As this procedure is entered, mState.mNumVertices,mState.mNumEdges,mDegree etc are set for some graph,
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
   nft[0..numNft-1] is a list of the non-facial triangles.
  */
  void scan(final int nbTot, final int nbOp, final Edge wheelRim, final boolean doSplit,
            final Edge[] pEdges, final int nPedges, final Triangle[] nft, final int numNft) {

    if (mState.mNumVertices == mPlantri.mMaxNV) {
      final int connec = 3 + (numNft == 0 ? 1 : 0);
      if (connec >= mPlantri.getMinConnectivity()) {
        mPlantri.gotOne(nbTot, nbOp, connec);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(doSplit);
    if (firstEdgeSave == null) {
      return;
    }

    final Edge[] extP = new Edge[Plantri.MAX_EDGES];
    final Edge[] extQ = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newPedges = new Edge[Plantri.MAX_VERTICES / 2];
    final Triangle[] newNft = Triangle.create(Plantri.MAX_VERTICES);
    final MutableInteger nextP = new MutableInteger();
    final MutableInteger nextQ = new MutableInteger();
    mBipFinder.findExtensions(nbTot, nbOp, extP, nextP, extQ, nextQ, pEdges, nPedges);

    if (mState.mNumVertices == mPlantri.mMaxNV - 2 && numNft > 0 && mPlantri.getMinConnectivity() == 4) {
      bipNftLastStep(extP, nextP, nft, numNft);
    }

    final int sSplitLevel = mPlantri.mSplitLevel;
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    if (wheelRim != null && mState.mNumVertices <= mPlantri.mMaxNV - 2) {
      mBipP.extend(wheelRim);
      Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp);
      scan(xnbTot.get(), xnbOp.get(), wheelRim, mState.mNumVertices == sSplitLevel || mState.mNumVertices == sSplitLevel + 1, pEdges, 0, nft, numNft);
      mBipP.reduce(wheelRim);
    }

    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nGoodRef = new MutableInteger();
    final MutableInteger nGoodMir = new MutableInteger();
    final MutableInteger nGoodMirRef = new MutableInteger();
    for (int i = 0; i < nextP.get(); ++i) {
      mBipP.extend(extP[i]);
      mBipP.legal(extP[i], goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, nPedges != 0 ? pEdges[nPedges - 1] : null);
      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          final int newNumNft = updateNftP(nft, numNft, extP[i], newNft);
          final int connec = 3 + (newNumNft == 0 ? 1 : 0);
          if (connec >= mPlantri.getMinConnectivity()) {
            mPlantri.gotOne(1, 1, connec);
          }
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          final int newNumNft = updateNftP(nft, numNft, extP[i], newNft);
          pEdges[nPedges] = extP[i];
          scan(1, 1, null, mState.mNumVertices == sSplitLevel || mState.mNumVertices == sSplitLevel + 1, pEdges, nPedges + 1, newNft, newNumNft);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          final int newNumNft = updateNftP(nft, numNft, extP[i], newNft);
          pEdges[nPedges] = extP[i];
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == sSplitLevel || mState.mNumVertices == sSplitLevel + 1, pEdges, nPedges + 1, newNft, newNumNft);
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
          final int newNumNft = updateNftQ(nft, numNft, extQ[i], newNft);
          scan(xnbTot.get(), xnbOp.get(), null, mState.mNumVertices == sSplitLevel, newPedges, 0, newNft, newNumNft);
        }
      }
      mBipQ.reduce(extQ[i]);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }

}
