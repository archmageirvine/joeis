package irvine.oeis.a325;

import irvine.math.z.Z;
import irvine.oeis.a328.A328682;

/**
 * A325476 Number of connected regular loopless multigraphs on n unlabeled nodes of degree less than n.
 * @author Gregory Morse
 */
public class A325476 extends A328682 {
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 1; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
