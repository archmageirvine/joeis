package irvine.oeis.a014;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014235 Number of n X n matrices with entries 0 and 1 and no 2 X 2 submatrix of form <code>[ 1 1; 1 0 ]</code>.
 * @author Sean A. Irvine
 */
public class A014235 implements Sequence {

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
      sum = sum.add(kf.multiply(Stirling.secondKind(mN + 1, k + 1).square()));
    }
    return sum;
  }
}
