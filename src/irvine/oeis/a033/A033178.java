package irvine.oeis.a033;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033178 Number of multisets of n positive integers with equal sum and product.
 * @author Sean A. Irvine
 */
public class A033178 implements Sequence {

  private long mCount = 0;
  private int mN = 1;

  private Z prod(final int[] v) {
    Z prod = Z.ONE;
    for (int k = v.length - 1; k >= 0 && v[k] != 1; --k) {
      prod = prod.multiply(v[k]);
    }
    return prod;
  }

  private boolean bump(final int[] v) {
    for (int k = v.length - 1; k >= 0; --k) {
      Arrays.fill(v, k, v.length, v[k] + 1);
      final Z sum = Z.valueOf(IntegerUtils.sum(v));
      final Z prod = prod(v);
      final int c = prod.compareTo(sum);
      if (c == 0) {
        ++mCount;
      }
      if (c <= 0) {
        return true;
      }
    }
    return false;
  }

  private void search(int[] v) {
    while (bump(v)) {
      // do nothing
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 1; // initial condition is always a solution
    final int[] v = new int[mN];
    Arrays.fill(v, 1);
    v[mN - 2] = 2;
    v[mN - 1] = mN;
    search(v);
    return Z.valueOf(mCount);
  }
}
