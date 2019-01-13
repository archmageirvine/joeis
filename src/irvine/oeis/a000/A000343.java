package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000343.
 * @author Sean A. Irvine
 */
public class A000343 extends A000081 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int n = size();
    super.next();
    return RING.pow(polynomial(), 5, n).coeff(n);
  }
}
