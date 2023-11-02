package irvine.oeis.a297;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a061.A061469;

/**
 * A297850 Least common prime factor of the members of n-th amicable pair, or 0 if the two members of the pair are coprime.
 * @author Georg Fischer
 */
public class A297850 extends A061469 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
