package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077758 Largest n-digit multiple of n with digit sum n.
 * @author Sean A. Irvine
 */
public class A077758 extends Sequence1 {

  private int mN = 0;

  private Z search(final Z v, final int remainingSum, final int remainingDigits) {
    if (remainingDigits == 0) {
      if (remainingSum == 0 && v.mod(mN) == 0) {
        return v;
      }
      return null;
    }
    final Z u = v.multiply(10);
    for (int d = Math.min(9, remainingSum); d >= 0; --d) {
      final Z r = search(u.add(d), remainingSum - d, remainingDigits - 1);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  @Override
  public Z next() {
    return search(Z.ZERO, ++mN, mN);
  }
}

