package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058155 Number of labeled commutative monoids of order n.
 * @author Sean A. Irvine
 */
public class A058155 extends A058156 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
