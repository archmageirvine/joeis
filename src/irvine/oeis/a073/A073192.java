package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073192 Number of general plane trees whose n-th subtree from the left is equal to the n-th subtree from the right, for all its subtrees (i.e., are palindromic in the shallow sense).
 * @author Sean A. Irvine
 */
public class A073192 extends Sequence0 {

  private long mN = -1;

  private Z gat(final long n) {
    return n == -1 ? Z.ONE : Functions.CATALAN.z(n);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; k += 2) {
      sum = sum.add(gat(k / 2).multiply(gat(mN - 1 - k)));
    }
    return sum;
  }
}

