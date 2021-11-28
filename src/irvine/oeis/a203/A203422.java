package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203422 Reciprocal of Vandermonde determinant of (1/2,1/3,...,1/(n+1)).
 * @author Georg Fischer
 */
public class A203422 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(new Q(1, k + 1).subtract(new Q(1, j + 1)));
      }
    }
    return prod.den().multiply(prod.signum());
  }
}
