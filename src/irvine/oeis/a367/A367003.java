package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A367003.
 * @author Sean A. Irvine
 */
public class A367003 extends A003261 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
