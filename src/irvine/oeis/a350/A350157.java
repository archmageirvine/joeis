package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.a347.A347999;

/**
 * A350157 Total number of nodes in the smallest connected component summed over all endofunctions on [n].
 * @author Gregory Morse
 */
public class A350157 extends A347999 {
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN + 1; ++k) {
      sum = sum.add(compute(mN, k).multiply(k));
    }
    return sum;
  }
}
