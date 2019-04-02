package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a004.A004747;

/**
 * A015735 Row sums of triangle A004747.
 * @author Sean A. Irvine
 */
public class A015735 extends A004747 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
