package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034742 Dirichlet convolution of Moebius function mu(n) (A008683) with Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A034742 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(d - 1).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
