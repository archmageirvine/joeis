package irvine.oeis.a109;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a038.A038395;

/**
 * A109837 Smallest prime factor of the reverse concatenation of the first n odd numbers.
 * @author Georg Fischer
 */
public class A109837 extends A038395 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
