package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A203426 Reciprocal of Vandermonde determinant of (1/4,1/6,...,1/(2n+2)).
 * @author Georg Fischer
 */
public class A203426 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(new Q(1, 2L * k + 2).subtract(new Q(1, 2L * j + 2)));
      }
    }
    return prod.den().multiply(prod.signum());
  }
}
