package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000305 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A000305 extends Sequence1 {

  private int mN = 0;

  private Z t(final int n, final int k) {
    Z s = Z.ZERO;
    if (k <= n) {
      for (int j = k; j <= Math.min(n, 2 * k - 1); ++j) {
        s = s.add(Functions.FACTORIAL.z(j - 1)
                  .multiply(2L * j - k + 1)
                  .multiply(Functions.FACTORIAL.z(3 * n - k - j))
                  .divide(Functions.FACTORIAL.z(j - k + 1))
                  .divide(Functions.FACTORIAL.z(j - k))
                  .divide(Functions.FACTORIAL.z(2 * k - j - 1))
                  .divide(Functions.FACTORIAL.z(n - j)));
      }
      s = s.multiply(k).divide(Functions.FACTORIAL.z(2 * n - k + 1));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      r = r.add(t(mN, k));
    }
    return r;
  }
}
