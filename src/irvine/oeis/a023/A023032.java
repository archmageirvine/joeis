package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000741;

/**
 * A023032 Number of compositions of n into 7 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023032 extends A000741 {

  {
    for (int k = 0; k < 6; ++k) {
      super.next();
    }
  }

  @Override
  protected Z p(final Z n) {
    return Binomial.binomial(n.longValue() - 1, 6);
  }
}
