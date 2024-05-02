package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047873 a(n) = max_{r=1..n-1} ceiling(t(t(n)-t(r-1))/(n-r+1)), where t() = triangular numbers A000217.
 * @author Sean A. Irvine
 */
public class A047873 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ONE;
    final long tn = Functions.TRIANGULAR.l(++mN);
    for (long r = 1; r < mN; ++r) {
      max = max.max(Functions.TRIANGULAR.z(tn - Functions.TRIANGULAR.l(r - 1)).add(mN - r).divide(mN - r + 1));
    }
    return max;
  }
}
