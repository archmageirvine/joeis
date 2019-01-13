package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Dispatcher for Eulerian triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class EulerianDispatcher {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Numbering mNumbering;
  private final int mMaxVertex;

  EulerianDispatcher(final Plantri plantri, final Numbering numbering, final int maxVertex) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mMaxVertex = maxVertex;
  }

  void dispatch(final int minConnecIn, final boolean exact, final boolean needGroup) {
    if (mPlantri.getMinDegree() <= 0) {
      mPlantri.setMinDegree(4);
    }
    final int minConnec = minConnecIn <= 0 ? 3 : minConnecIn;

    final int hint = Math.min(mMaxVertex <= 22 ? mMaxVertex - 5 : mMaxVertex - 6, 21);
    mPlantri.initializeSplitting(6, hint, mMaxVertex - 2);
    if (mPlantri.mSplitLevel == 0 && mPlantri.mRes > 0) {
      return;
    }

    Bipartite.init(mState);
    mPlantri.setExactConnectivity(minConnec);
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
    final Edge[] pEdges = new Edge[Plantri.MAX_VERTICES / 2 + 1];
    final Edge edge = mState.mFirstEdge[0];
    final boolean doSplit = mPlantri.mSplitLevel == 6;
    if (exact || minConnec == 4) {
      new Bipartite4CScanner(mPlantri, mNumbering, needGroup).scan(nbTot.get(), nbOp.get(), edge, doSplit, pEdges, 0, new Triangle[mMaxVertex], 0);
    } else {
      new BipartiteScanner(mPlantri, mNumbering, needGroup).scan(nbTot.get(), nbOp.get(), edge, doSplit, pEdges, 0);
    }
  }
}
