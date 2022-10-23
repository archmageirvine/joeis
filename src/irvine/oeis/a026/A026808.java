package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026808 a(n) is the number of products P of distinct positive integers satisfying P &lt;= n.
 * @author Sean A. Irvine
 */
public class A026808 extends Sequence1 {

  private long mN = 0;
  private long mC = 0;

  private void search(final long product, final long n) {
    for (long m = n - 1; m >= 1; --m) {
      if (product * m <= mN) {
        ++mC;
        search(product * m, m);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mC = 0;
    for (long m = mN; m > 1; --m) {
      search(m, m);
    }
    return Z.valueOf(mC);
  }
}
