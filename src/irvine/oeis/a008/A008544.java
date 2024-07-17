package irvine.oeis.a008;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A008544 Triple factorial numbers: Product_{k=0..n-1} (3*k+2).
 * @author Sean A. Irvine
 */
public class A008544 extends Sequence0 implements DirectSequence {

  private long mN = -4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.product(0, n - 1, k -> Z.valueOf(3L * k + 2));
  }

}
