package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014235 Number of n X n matrices with entries 0 and 1 and no 2 X 2 submatrix of form [ 1 1; 1 0 ].
 * @author Sean A. Irvine
 */
public class A014235 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      if (k > 1) {
        kf = kf.multiply(k);
      }
      sum = sum.add(kf.multiply(Functions.STIRLING2.z(mN + 1, k + 1).square()));
    }
    return sum;
  }
}
