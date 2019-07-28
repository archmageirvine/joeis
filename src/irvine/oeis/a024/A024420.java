package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024420 <code>n!(1/binomial(n,0) - 1/binomial(n,1) + ... + d/binomial(n,[ n/2 ]))</code>, where d <code>= (-1)^[ n/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A024420 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, mF.divide(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
