package irvine.oeis.a366;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a062.A062394;

/**
 * A049479.
 * @author Sean A. Irvine
 */
public class A366670 extends A062394 {

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
