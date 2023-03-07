package irvine.oeis.a104;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;

/**
 * A104358 Smallest prime factor of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104358 extends A104357 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
