package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023887 <code>a(n) = sigma_n(n)</code>: sum of n-th powers of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A023887 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(mN);
  }
}

