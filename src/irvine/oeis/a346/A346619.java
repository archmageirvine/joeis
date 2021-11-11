package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A346619 Triangle read by rows: T(n,k) = 1 iff 4 divides binomial(n,k) but 8 does not (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A346619 extends Triangle {

  /** Construct the sequence. */
  public A346619() {
  }

  @Override
  public Z next() {
    return super.next().getLowestSetBit() == 2 ? Z.ONE : Z.ZERO;
  }
}
