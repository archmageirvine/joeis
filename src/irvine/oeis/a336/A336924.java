package irvine.oeis.a336;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a088.A088580;

/**
 * A336924 a(n) = spf(1+sigma(n)), where spf is the smallest prime factor and sigma is the sum of divisors function.
 * @author Georg Fischer
 */
public class A336924 extends A088580 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
