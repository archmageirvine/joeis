package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000300.
 * @author Sean A. Irvine
 */
public class A000300 extends A000081 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int n = size();
    super.next();
    return RING.pow(polynomial(), 4, n).coeff(n);
  }
}
