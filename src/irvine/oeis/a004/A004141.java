package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004141.
 * @author Sean A. Irvine
 */
public class A004141 implements Sequence {

  private int mN = -1;

  private Z a(final int n, final int k) {
    return Binomial.binomial(n + k, n - k).multiply(n).shiftLeft(2 * k).divide(n + k);
  }

  @Override
  public Z next() {
    ++mN;
    Z max = Z.valueOf(mN + 1);
    for (int k = 0; k < mN; ++k) {
      final Z a = a(mN, k).abs();
      if (a.compareTo(max) > 0) {
        max = a;
      }
    }
    return max;
  }
}
