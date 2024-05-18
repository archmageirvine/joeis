package irvine.oeis.a007;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A007696 Quartic (or 4-fold) factorial numbers: a(n) = Product_{k = 0..n-1} (4*k + 1).
 * @author Sean A. Irvine
 */
public class A007696 extends Sequence0 implements DirectSequence {

  private long mN = -7;
  private Z mA = null;

  @Override
  public Z next() {
    mN += 4;
    mA = mA == null ? Z.ONE : mA.multiply(mN);
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.product(0, n - 1, k -> Z.valueOf(4 * k + 1));
  }

}
