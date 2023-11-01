package irvine.oeis.a075;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A087173.
 * @author Sean A. Irvine
 */
public class A075019 extends A007908 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
