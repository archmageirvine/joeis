package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000741;

/**
 * A023031.
 * @author Sean A. Irvine
 */
public class A023031 extends A000741 {

  {
    for (int k = 0; k < 5; ++k) {
      super.next();
    }
  }

  @Override
  protected Z p(final Z n) {
    return Binomial.binomial(n.longValue() - 1, 5);
  }
}
