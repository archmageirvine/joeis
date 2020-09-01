package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A034715 Dirichlet convolution of triangular numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034715 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(A000217.triangular(d).multiply(A000217.triangular(mN / d)));
    }
    return sum;
  }
}
