package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001241 Differences of reciprocals of unity.
 * @author Sean A. Irvine
 */
public class A001241 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private Z mC = Z.THREE;
  private Z mD = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(24);
    mB = mB.multiply(12);
    mC = mC.shiftLeft(3);
    mD = mD.multiply(6);
    return mA.subtract(mB).add(mC).subtract(mD).divide(6);
  }
}
