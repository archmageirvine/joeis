package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002137.
 * @author Sean A. Irvine
 */
public class A002137 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z t = mC.add(mB).multiply(mN).subtract(mA.multiply(mN - 1).multiply(mN).divide(2));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
