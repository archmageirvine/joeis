package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.a046.A046752;

/**
 * A360879 Number of unlabeled nonseparable (or 2-connected) loopless multigraphs with circuit rank n and degree &gt;= 3 at each node.
 * @author Gregory Morse
 */
public class A360879 extends A046752 {
  private int mN = 0;

  /** Construct the sequence. */
  public A360879() {
    setOffset(1);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k <= 2 * mN - 2; ++k) {
      sum = sum.add(get(k, mN + k - 1).size());
    }
    return sum;
  }
}
