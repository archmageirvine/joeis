package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058159 Triangle read by rows: T(n,k) is the number of labeled commutative monoids of order n with k idempotents.
 * @author Sean A. Irvine
 */
public class A058159 extends A058160 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
