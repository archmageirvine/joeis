package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203424 Reciprocal of Vandermonde determinant of (1/2, 1/4,..., 1/(2n)).
 * @author Georg Fischer
 */
public class A203424 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(new Q(1, 2 * k).subtract(new Q(1, 2 * j)));
      }
    }
    return prod.den().multiply(prod.signum());
  }
}
