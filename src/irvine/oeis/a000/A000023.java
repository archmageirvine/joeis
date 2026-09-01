package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000023 a(n) is the number of permutations on {1,2,...,n} with an even number of fixed points minus the number of permutations with an odd number of fixed points.
 * @author Sean A. Irvine
 */
public class A000023 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z p = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      final Z v = p.shiftLeft(mN - k);
      sum = sum.signedAdd(((mN - k) & 1) == 0, v);
      p = p.multiply(mN - k);
    }
    return sum;
  }
}

