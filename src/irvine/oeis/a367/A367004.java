package irvine.oeis.a367;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367002.
 * @author Sean A. Irvine
 */
public class A367004 extends A002064 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
