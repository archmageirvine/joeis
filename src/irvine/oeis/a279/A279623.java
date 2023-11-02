package irvine.oeis.a279;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A279623 a(n) = smallest prime factor of n-th Bell number, or 1 if there are none.
 * @author Georg Fischer
 */
public class A279623 extends A000110 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
