package irvine.oeis.a309;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a077.A077586;

/**
 * A309130 Smallest prime factor of A077586(n).
 * @author Georg Fischer
 */
public class A309130 extends A077586 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
