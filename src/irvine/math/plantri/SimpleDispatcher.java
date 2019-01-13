package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * All the cases not handled in the other dispatch routines.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class SimpleDispatcher {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Numbering mNumbering;
  private final int mMaxVertex;

  SimpleDispatcher(final Plantri plantri, final Numbering numbering, final int maxVertex) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mMaxVertex = maxVertex;
  }

  /* Make a loop with a vertex of degree 1 inside and outside. */
  private void makeGyro() {
    Cycle.makeCycle(3, mState);
    mPlantri.mSwitcher.switchEdge(mState.mFirstEdge[0]);
  }

  void simpleDispatch() {
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();

    if (mPlantri.getMinDegree() <= 0) {
      mPlantri.setMinDegree(3);
    }
    if (mPlantri.getMinConnectivity() <= 0) {
      mPlantri.setMinConnectivity(mPlantri.getMinDegree());
    }
    final int startingSize = 4;

    Plantri.checkRange(mMaxVertex, "n", 3, Plantri.MAX_VERTICES);
    Plantri.checkRange(mPlantri.getMinDegree(), "-m", 1, 3);

    final int hint = Math.min(mMaxVertex <= 13 ? mMaxVertex - 2 : mMaxVertex - 3, 14);
    mPlantri.initializeSplitting(startingSize, hint, mMaxVertex - 1);
    if (mPlantri.mSplitLevel == 0 && mPlantri.mRes > 0) {
      return;
    }

    mPlantri.setExactConnectivity(mPlantri.getMinConnectivity());
    final boolean needGroup = mPlantri.mBigGSwitch || mPlantri.getMinConnectivity() < 3;
    final SimpleScanner scanner = new SimpleScanner(mPlantri, mNumbering, mPlantri.mVertexMarks, needGroup);
    if (mMaxVertex >= startingSize) {
      mPlantri.initializeTriang();
      Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
      scanner.scan(nbTot.get(), nbOp.get());
    } else if (mMaxVertex == 3) {
      if (mPlantri.getMinConnectivity() <= 2 && mPlantri.getMinDegree() <= 2) {
        Cycle.makeCycle(3, mState);
        Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
        mPlantri.gotOne(nbTot.get(), nbOp.get(), 2);
      }
      if (mPlantri.getMinConnectivity() == 1 && mPlantri.getMinDegree() == 1) {
        makeGyro();
        Canon.canon(mPlantri, mState.mFirstEdge, mState.mDegree, mNumbering, nbTot, nbOp);
        mPlantri.gotOne(nbTot.get(), nbOp.get(), 1);
      }
    }
  }
}
