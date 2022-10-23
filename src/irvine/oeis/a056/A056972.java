package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056972 Number of (binary) heaps on n levels (i.e., of 2^n - 1 elements).
 * @author Sean A. Irvine
 */
public class A056972 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.square().multiply(Binomial.binomial((1L << mN) - 2, (1L << (mN - 1)) - 1));
    }
    return mA;
  }
}
