package irvine.oeis.a299;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;

/**
 * A299959 Least prime factor of (4^(2n+1)+1)/5, a(0) = 1.
 * @author Georg Fischer
 */
public class A299959 extends A299960 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
