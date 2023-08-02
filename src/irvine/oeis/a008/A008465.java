package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A008465 2^(2n-6) * C(n,3) - 2^(n-2) * C(n,4).
 * @author Sean A. Irvine
 */
public class A008465 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3).shiftLeft(2L * mN - 6).subtract(Binomial.binomial(mN, 4).shiftLeft(mN - 2));
  }
}
