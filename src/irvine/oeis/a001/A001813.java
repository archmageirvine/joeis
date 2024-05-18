package irvine.oeis.a001;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001813 Quadruple factorial numbers: a(n) = (2n)!/n!.
 * @author Sean A. Irvine
 */
public class A001813 extends Sequence0 implements DirectSequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1).divide(mN);
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.product(n + 1, 2 * n, k -> Z.valueOf(k));
  }

}
