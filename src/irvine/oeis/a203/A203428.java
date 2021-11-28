package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203428 Reciprocal of Vandermonde determinant of (1/3,1/6,...,1/(3n)).
 * @author Georg Fischer
 */
public class A203428 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(new Q(1, 3 * k).subtract(new Q(1, 3 * j)));
      }
    }
    return prod.den().multiply(prod.signum());
  }
}
