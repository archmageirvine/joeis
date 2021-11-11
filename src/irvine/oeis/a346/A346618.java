package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A346618 Triangle read by rows: T(n,k) = 1 iff 2 divides binomial(n,k) but 4 does not (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A346618 extends Triangle {

  @Override
  public Z next() {
    return super.next().getLowestSetBit() == 1 ? Z.ONE : Z.ZERO;
  }
}
