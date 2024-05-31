package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006541 Number of dissimilarity relations on an n-set.
 * @author Sean A. Irvine
 */
public class A006541 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long m = mN * (mN - 1) / 2;
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    for (long k = 1; k <= m; ++k) {
      f = f.multiply(k);
      sum = sum.add(f.multiply(Functions.STIRLING2.z(m, k)));
    }
    return sum;
  }
}
