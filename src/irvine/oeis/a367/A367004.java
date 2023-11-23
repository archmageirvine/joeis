package irvine.oeis.a367;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367004 a(n) is the smallest prime factor of n*2^n+1.
 * @author Sean A. Irvine
 */
public class A367004 extends A002064 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
