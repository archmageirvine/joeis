package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Min5CScanner extends Min5Scanner {

  Min5CScanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final boolean needGroup) {
    super(plantri, numbering, vertexMarks, needGroup);
  }

  /* The main node of the recursion for 5-connected triangulations.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     If doSplit==true, this is the place to do splitting (if any).
     prev[0..nprevA-1] is the list of consecutive A operations leading
     to this graph, given by their central edges.
     If nprevA == 0, this graph wasn't made with A.
  */
  void scanMin5c(final int nbTot, final int nbOp, final boolean doSplit, final Edge[] prevA, final int nprevA) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      mPlantri.gotOne(nbTot, nbOp, 5);
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
    Edge extAred, extBred, extCred;
    final boolean[] extBmirror = new boolean[Plantri.MAX_EDGES];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodMir = new Edge[Plantri.MAX_EDGES];
    final Edge[] newprevA = new Edge[Plantri.MAX_VERTICES];
    final int[] colour = new int[Plantri.MAX_VERTICES];

    mMin5Finder.findExtensions(nbTot, nbOp, extA1, extA2, nextA, extB, extBmirror, nextB, extC, nextC, nprevA == 0 ? null : prevA[nprevA - 1]);

    if (nextA.get() > Plantri.MAX_VERTICES * Plantri.MAX_VERTICES / 4) {
      throw new RuntimeException("Increase the array bounds for extA1 and extA2 in scanMin5() and scanMin5c().");
    }

    for (int i = 0; i < nextA.get(); ++i) {
      extAred = mMin5A.extendMin5A(extA1[i], extA2[i]);
      mMin5A.isLegal(extAred, goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, prevA, nprevA);

      if (nGoodRef.get() + nGoodMirRef.get() > 0) {
        if (mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup && nGoodOr.get() == nGoodRef.get() && nGoodMir.get() == nGoodMirRef.get()) {
          mPlantri.gotOne(1, 1, 5);
        } else if (nGoodOr.get() + nGoodMir.get() == 1) {
          prevA[nprevA] = extAred;
          scanMin5c(1, 1, mState.mNumVertices == mPlantri.mSplitLevel, prevA, nprevA + 1);
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
          prevA[nprevA] = extAred;
          scanMin5c(xnbTot.get(), xnbOp.get(), mState.mNumVertices == mPlantri.mSplitLevel, prevA, nprevA + 1);
        }
      }
      mMin5A.reduceMin5A(extAred);
    }

    for (int i = 0; i < nextB.get(); ++i) {
      extBred = extendMin5B(extB[i], extBmirror[i]);
      if (!mMin5A.hasMin5A()) {
        mMin5B.legal(extBred, extBmirror[i], goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef);

        if (nGoodRef.get() + nGoodMirRef.get() > 0) {
          if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nGoodRef.get(), goodMir, nGoodMir.get(), nGoodMirRef.get(), mDegree, mNumbering, xnbTot, xnbOp)) {
            scanMin5c(xnbTot.get(), xnbOp.get(), mState.mNumVertices == mPlantri.mSplitLevel || mState.mNumVertices == mPlantri.mSplitLevel + 1, newprevA, 0);
          }
        }
      }
      reduceMin5B(extBred, extBmirror[i]);
    }

    final Edge[] extCAnchor = new Edge[1];
    for (int i = 0; i < nextC.get(); ++i) {
      extCred = mMin5C.extend(extC[i], extCAnchor);
      if (!mMin5A.hasMin5A() && !hasMin5B()) {
        for (int j = 0; j < mState.mNumVertices - 1; ++j) {
          if (isMin5CCentre(j)) {
            colour[j] = 2;
          } else {
            colour[j] = mDegree[j];
          }
        }
        colour[mState.mNumVertices - 1] = 2;

        if (Canon.canon(mPlantri, mFirstEdge, colour, mNumbering, xnbTot, xnbOp)) {
          scanMin5c(xnbTot.get(), xnbOp.get(), mState.mNumVertices >= mPlantri.mSplitLevel && mState.mNumVertices <= mPlantri.mSplitLevel + 4, newprevA, 0);
        }
      }
      mMin5C.reduce(extCred, extCAnchor);
    }

    if (doSplit) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }
}
