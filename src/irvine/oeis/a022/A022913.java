package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022913 Arrange the nontrivial binomial coefficients <code>C(m,k) (2 &lt;= k &lt;= m-2)</code> in increasing order; record the positions of the central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A022913 extends A022911 {

  private long mN = 0;

  @Override
  protected Z select(final Pair<Long, Long> a) {
    // Returns 1 iff a central binomial coefficient
    return a.left() == 2 * a.right() ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
