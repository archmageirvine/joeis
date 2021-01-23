package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022912 Arrange the nontrivial binomial coefficients C(m,k) (2 &lt;= k &lt;= m/2) in increasing order (not removing duplicates); record the sequence of k's.
 * @author Sean A. Irvine
 */
public class A022912 extends A022911 {

  @Override
  protected Z select(final Pair<Long, Long> a) {
    return Z.valueOf(a.right());
  }
}
