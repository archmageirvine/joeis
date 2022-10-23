package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023887 a(n) = sigma_n(n): sum of n-th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A023887 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(mN);
  }
}

