package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.a296.A296546;

/**
 * A234616 Numbers of undirected cycles in the complete tripartite graph K_{n,n,n}.
 * @author Gregory Morse
 */
public class A234616 extends A296546 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= 3 * mN; ++k) {
      sum = sum.add(cycles(mN, k));
    }
    return sum;
  }
}
