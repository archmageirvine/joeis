package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010370 a(n) = binomial(2*n, n)^2 / (1-2*n).
 * @author Sean A. Irvine
 */
public class A010370 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).square().divide(1 - 2 * mN);
  }
}
