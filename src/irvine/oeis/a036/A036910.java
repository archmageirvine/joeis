package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036910 a(n) = (binomial(4*n, 2*n) + binomial(2*n, n)^2)/2.
 * @author Sean A. Irvine
 */
public class A036910 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, 2 * mN).add(Binomial.binomial(2 * mN, mN).square()).divide2();
  }
}
