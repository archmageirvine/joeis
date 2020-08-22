package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023887 a(n) = sigma_n(n): sum of n-th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A023887 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(mN);
  }
}

