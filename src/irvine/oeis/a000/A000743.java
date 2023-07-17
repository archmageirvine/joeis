package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000743 Number of compositions of n into 5 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A000743 extends A000741 {

  /** Construct the sequence. */
  public A000743() {
    super(5);
  }

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  protected Z p(final Z n) {
    return Binomial.binomial(n.longValue() - 1, 4);
  }
}
