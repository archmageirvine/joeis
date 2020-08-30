package irvine.oeis.a034;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034696 Dirichlet convolution of primes (A000040) with themselves.
 * @author Sean A. Irvine
 */
public class A034696 extends A000040 {

  private final ArrayList<Z> mPrimes = new ArrayList<>();
  {
    mPrimes.add(null);
  }
  private int mN = 0;

  @Override
  public Z next() {
    mPrimes.add(super.next());
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mPrimes.get(d).multiply(mPrimes.get(mN / d)));
    }
    return sum;
  }
}

