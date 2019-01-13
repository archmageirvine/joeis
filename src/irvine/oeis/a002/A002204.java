package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002204.
 * @author Sean A. Irvine
 */
public class A002204 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long t = 2 * mN - 2;
      mA = mA.multiply(Binomial.binomial(t, mN - 2)).multiply(Binomial.binomial(t, mN - 1)).multiply(t + 1);
    }
    return mA;
  }
}
