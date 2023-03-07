package irvine.oeis.a342;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;

/**
 * A342836 a(n) is the smallest prime factor of A342834(n).
 * @author Georg Fischer
 */
public class A342836 extends A342834 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
