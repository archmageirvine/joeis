package irvine.oeis.a209;

import irvine.math.z.Z;

/**
 * A209327 Total number of nodes in the largest connected component of a functional digraph summed over all endofunctions f:{1,2,...,n}-&gt; {1,2,...,n}.
 * @author Gregory Morse
 */
public class A209327 extends A209324 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(compute(mN - 1, k).multiply(k + 1));
    }
    return sum;
  }
}
