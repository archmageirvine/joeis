package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A037092 Number of triples {i,j,k}, i&gt;1, j&gt;1, k&gt;1, such that ijk &lt; n^3.
 * @author Sean A. Irvine
 */
public class A037092 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3).subtract(1);
    Z sum = Z.ZERO;
    for (long k = 2; k < mN; ++k) {
      final Q u = new Q(n3, Z.valueOf(k));
      for (long j = k; j <= u.toZ().sqrt().longValueExact(); ++j) {
        sum = sum.add(u.divide(j).toZ().subtract(j - 1));
      }
    }
    return sum;
  }
}
