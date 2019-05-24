package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000741;

/**
 * A023035 Number of compositions of n into 10 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023035 extends A000741 {

  {
    for (int k = 0; k < 9; ++k) {
      super.next();
    }
  }

  @Override
  protected Z p(final Z n) {
    return Binomial.binomial(n.longValue() - 1, 9);
  }
}
