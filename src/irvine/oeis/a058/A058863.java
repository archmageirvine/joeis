package irvine.oeis.a058;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058863 Number of connected labeled chordal graphs on n nodes with no induced path P_4; also the number of labeled trees with each vertex replaced by a clique.
 * @author Sean A. Irvine
 */
public class A058863 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Stirling.secondKind(mN, k).multiply(Z.valueOf(k).pow(k - 1)));
    }
    return sum;
  }
}

