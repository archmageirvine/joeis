package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A054676 Numerator of expected length of longest increasing subsequence of a permutation of length n.
 * @author Sean A. Irvine
 */
public class A054676 extends A047874 {

  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z e = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final Z t = super.next();
      sum = sum.add(t);
      e = e.add(t.multiply(k));
    }
    return select(new Q(e, sum));
  }
}
