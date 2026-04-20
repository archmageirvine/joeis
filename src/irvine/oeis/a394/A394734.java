package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a023.A023196;

/**
 * A394734 a(n) is the number of subsets of proper divisors of A023196(n) that add to A023196(n).
 * @author Sean A. Irvine
 */
public class A394734 extends A023196 {

  private long mCount = 0;

  private void search(final Z[] d, final int k, final Z n) {
    if (n.isZero()) {
      ++mCount;
      return;
    }
    for (int j = k; j < d.length - 1; ++j) {
      final Z m = n.subtract(d[j]);
      if (m.signum() < 0) {
        return;
      }
      search(d, j + 1, m);
    }
  }

  @Override
  public Z next() {
    final Z n = super.next();
    mCount = 0;
    search(Jaguar.factor(n).divisorsSorted(), 0, n);
    return Z.valueOf(mCount);
  }
}
