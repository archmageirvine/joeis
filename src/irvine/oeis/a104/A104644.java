package irvine.oeis.a104;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a019.A019518;

/**
 * A104644 a(n) is the smallest prime divisor of the number obtained from concatenation of the first n primes.
 * @author Georg Fischer
 */
public class A104644 extends A019518 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
