package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a064.A064078;

/**
 * A063982 Number of divisors of 2^n - 1 that are relatively prime to 2^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A063982 extends A064078 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
