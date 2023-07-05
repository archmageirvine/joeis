package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015909 a(n) = smallest k &gt;= 1 such that n divides k^n + k.
 * @author Sean A. Irvine
 */
public class A015909 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      if ((Z.valueOf(k).modPow(n, n).longValueExact() + k) % mN == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
