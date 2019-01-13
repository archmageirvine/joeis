package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001241.
 * @author Sean A. Irvine
 */
public class A001241 implements Sequence {

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
