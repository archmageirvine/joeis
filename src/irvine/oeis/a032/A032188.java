package irvine.oeis.a032;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032188 Number of labeled series-reduced mobiles (circular rooted trees) with n leaves (root has degree 0 or &gt;= 2).
 * @author Sean A. Irvine
 */
public class A032188 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.EULERIAN2.z(mN, k).shiftLeft(k));
    }
    return sum;
  }
}
