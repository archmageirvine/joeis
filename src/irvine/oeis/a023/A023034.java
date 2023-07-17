package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000741;

/**
 * A023034 Number of compositions of n into 9 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023034 extends A000741 {

  /** Construct the sequence. */
  public A023034() {
    super(9);
  }

  {
    for (int k = 0; k < 8; ++k) {
      super.next();
    }
  }

  @Override
  protected Z p(final Z n) {
    return Binomial.binomial(n.longValue() - 1, 8);
  }
}
