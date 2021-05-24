package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A047873 a(n) = max_{r=1..n-1} ceiling(t(t(n)-t(r-1))/(n-r+1)), where t() = triangular numbers A000217.
 * @author Sean A. Irvine
 */
public class A047873 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ONE;
    final long tn = A000217.triangular(++mN).longValueExact();
    for (long r = 1; r < mN; ++r) {
      max = max.max(A000217.triangular(tn - A000217.triangular(r - 1).longValue()).add(mN - r).divide(mN - r + 1));
    }
    return max;
  }
}
