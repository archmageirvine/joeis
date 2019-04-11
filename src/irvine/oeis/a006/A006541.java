package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006541 Number of dissimilarity relations on <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A006541 implements Sequence {

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
      sum = sum.add(f.multiply(Stirling.secondKind(m, k)));
    }
    return sum;
  }
}
