package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069929 Number of k, 1 &lt;= k &lt;= n, such that k^3+1 divides n^3+1.
 * @author Sean A. Irvine
 */
public class A069929 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z m = Z.valueOf(++mN).pow(3).add(1);
    long count = 0;
    for (long k = 1; k <= mN; ++k) {
      if (m.mod(Z.valueOf(k).pow(3).add(1)).isZero()) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
