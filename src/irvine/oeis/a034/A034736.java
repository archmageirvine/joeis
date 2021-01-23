package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;

/**
 * A034736 Dirichlet convolution of b_n=2^(n-1) with Primes (with 1).
 * @author Sean A. Irvine
 */
public class A034736 implements Sequence {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mPrimes.a(mN / d - 1).shiftLeft(d - 1));
    }
    return sum;
  }
}
