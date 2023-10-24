package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066511 f-amicable numbers where f(n) = n-1.
 * @author Sean A. Irvine
 */
public class A066511 extends A066505 {

  @Override
  protected Z f(final Z n) {
    return n.subtract(1);
  }

  @Override
  protected Z fInverse(final Z n) {
    return n.add(1);
  }
}
