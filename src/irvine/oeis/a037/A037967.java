package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037967 a(n) = (binomial(2*n, n)^2 + binomial(2*n, n))/2.
 * @author Sean A. Irvine
 */
public class A037967 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).square().add(Binomial.binomial(2 * mN, mN)).divide2();
  }
}

