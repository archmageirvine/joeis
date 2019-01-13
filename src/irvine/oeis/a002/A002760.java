package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002760.
 * @author Sean A. Irvine
 */
public class A002760 implements Sequence {

  private Z mSquareRoot = Z.ZERO;
  private Z mCubeRoot = Z.TWO;
  private Z mSquare = Z.ZERO;
  private Z mCube = Z.EIGHT;

  private void updateCube() {
    mCubeRoot = mCubeRoot.add(1);
    mCube = mCubeRoot.pow(3);
  }

  private void updateSquare() {
    mSquareRoot = mSquareRoot.add(1);
    mSquare = mSquareRoot.square();
  }

  @Override
  public Z next() {
    final Z res;
    if (mSquare.compareTo(mCube) <= 0) {
      if (mCube.equals(mSquare)) {
        // Rare case where n^2 = m^3
        updateCube();
      }
      res = mSquare;
      updateSquare();
    } else {
      res = mCube;
      updateCube();
    }
    return res;
  }
}
