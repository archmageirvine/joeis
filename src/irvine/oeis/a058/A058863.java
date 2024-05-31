package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058863 Number of connected labeled chordal graphs on n nodes with no induced path P_4; also the number of labeled trees with each vertex replaced by a clique.
 * @author Sean A. Irvine
 */
public class A058863 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Functions.STIRLING2.z(mN, k).multiply(Z.valueOf(k).pow(k - 1)));
    }
    return sum;
  }
}

