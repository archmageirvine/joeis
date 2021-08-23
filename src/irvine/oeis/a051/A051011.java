package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051011 Numerator of average of number of steps in Euclidean algorithm for all gcd(m,n) with 0&lt;=m&lt;n.
 * @author Sean A. Irvine
 */
public class A051011 extends A051010 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return select(new Q(sum, Z.valueOf(mN)));
  }
}
