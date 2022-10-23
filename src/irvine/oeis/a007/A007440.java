package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007440 Reversion of g.f. for Fibonacci numbers 1, 1, 2, 3, 5, ....
 * @author Sean A. Irvine
 */
public class A007440 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? mB : mA;
    }
    final Z t = mB.multiply(-(2 * mN - 1)).subtract(mA.multiply(5 * mN - 10)).divide(mN + 1);
    mA = mB;
    mB = t;
    return mB;
  }
}
