package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005264.
 * @author Sean A. Irvine
 */
public class A005264 extends MemoryFunction2<Integer, Z> implements Sequence {
  
  // After Peter Luschny

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    if (k == 0 && (n == 0 || n == 1)) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(n - 1).add(get(n - 1, k).multiply(3 * n - k - 4)).subtract(get(n - 1, k + 1).multiply(k + 1));
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, get(mN, k).shiftLeft(mN - k - 1));
    }
    return sum;
  }
}
