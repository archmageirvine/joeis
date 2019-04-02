package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000261 a(n) = n*a(n-1) + (n-3)*a(n-2), with a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A000261 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return mA;
    }
    if (mN == 2) {
      return mB;
    }
    final Z t = mB.multiply(mN).add(mA.multiply(mN - 3));
    mA = mB;
    mB = t;
    return t;
  }
}
