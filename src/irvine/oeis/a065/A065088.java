package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A065084.
 * @author Sean A. Irvine
 */
public class A065088 extends A000166 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN, 2));
  }
}
