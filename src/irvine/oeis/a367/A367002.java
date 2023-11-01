package irvine.oeis.a367;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A367002.
 * @author Sean A. Irvine
 */
public class A367002 extends A003261 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
