package irvine.oeis.a058;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058864 Number of labeled chordal graphs (connected or not) on n nodes with no induced path P_4.
 * @author Sean A. Irvine
 */
public class A058864 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Stirling.secondKind(mN, k).multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}

