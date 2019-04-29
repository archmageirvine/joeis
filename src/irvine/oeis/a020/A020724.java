package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020724.
 * @author Sean A. Irvine
 */
public class A020724 implements Sequence {

  private Z mA = Z.valueOf(12);
  private Z mB = Z.valueOf(18);
  private Z mC = Z.valueOf(6);

  @Override
  public Z next() {
    mA = mA.multiply(12);
    mB = mB.multiply(9);
    mC = mC.multiply(6);
    return mA.subtract(mB).add(mC).divide(18);
  }
}
