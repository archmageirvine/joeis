package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058157 Triangle read by rows: T(n,k) is the number of labeled monoids of order n with k idempotents.
 * @author Sean A. Irvine
 */
public class A058157 extends A058158 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
