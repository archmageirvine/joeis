package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Dispatcher for simple quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class QuadrangulationDispatcher {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Numbering mNumbering;
  private final int mMaxVertex;

  QuadrangulationDispatcher(final Plantri plantri, final Numbering numbering, final int maxVertex) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mMaxVertex = maxVertex;
  }

  void quadrangulationDispatch() {
    final Edge[] p1Edges = new Edge[mMaxVertex];
    if (mPlantri.getMinDegree() <= 0) {
      mPlantri.setMinDegree(3);
    }
    if (mPlantri.getMinConnectivity() <= 0) {
      mPlantri.setMinConnectivity(3);
    }
    if (mPlantri.getMinDegree() == 2 && mPlantri.getMinConnectivity() >= 3) {
      mPlantri.setMinDegree(3);
    }
    final int startingSize = mPlantri.getMinDegree() == 2 ? 4 : 8;

    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    if (mPlantri.getMinDegree() == 2) {
      final int hint = Math.min(mMaxVertex <= 16 ? mMaxVertex - 5 : mMaxVertex - 6, mMaxVertex < 25 ? 17 : 18);
      mPlantri.initializeSplitting(startingSize, hint, mMaxVertex - 1);
      if (mPlantri.mSplitLevel == 0 && mPlantri.mRes > 0) {
        return;
      }
      Quadrangulations.init(mState);
      new QuadrangulationAllScanner(mPlantri, mNumbering, mPlantri.mBigGSwitch).mQuadrP0.extend(mState.mFirstEdge[1]);
      mPlantri.setExactConnectivity(mPlantri.getMinConnectivity());
      Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
      new QuadrangulationAllScanner(mPlantri, mNumbering, mPlantri.mBigGSwitch).scanQuadrangulationsAll(nbTot.get(), nbOp.get());
    } else {
      final int hint = Math.min(mMaxVertex <= 23 ? mMaxVertex - 5 : mMaxVertex - 6, mMaxVertex < 30 ? 23 : 24);
      mPlantri.initializeSplitting(startingSize, hint, mMaxVertex - 2);
      if (mPlantri.mSplitLevel == 0 && mPlantri.mRes > 0) {
        return;
      }
      Min3Quadrangulations.init(mState);
      mPlantri.setExactConnectivity(mPlantri.getMinConnectivity());
      Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
      final Edge firstEdge = mState.mFirstEdge[0];
      final boolean doSplit = mPlantri.mSplitLevel == 8;
      final QuadrangulationScanner scanner;
      if (mPlantri.getMinConnectivity() == 3) {
        scanner = new QuadrangulationScanner(mPlantri, mNumbering, mPlantri.mBigGSwitch);
      } else if (mPlantri.getMinConnectivity() == 4) {
        scanner = new QuadrangulationNf4Scanner(mPlantri, mNumbering, mPlantri.mBigGSwitch);
      } else {
        scanner = new QuadrangulationMin3Scanner(mPlantri, mNumbering, mPlantri.mBigGSwitch);
      }
      scanner.scan(nbTot.get(), nbOp.get(), firstEdge, doSplit, p1Edges, 0);
    }
  }
}
