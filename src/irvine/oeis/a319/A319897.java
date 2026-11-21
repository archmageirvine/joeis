package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.a328.A328682;

/**
 * A319897 Number of connected regular loopless multigraphs on n unlabeled nodes with degree up to n.
 * @author Gregory Morse
 */
public class A319897 extends A328682 {
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
