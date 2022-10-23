package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069836 Inverse permutation to A057033: a(n) is the m such that A057033(m) = n, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A069836 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long m = mN;
    long i = 1;
    while (i < m) {
      if (m % ++i == 0) {
        m += i - 1;
      } else {
        --m;
      }
    }
    return Z.valueOf(m);
  }
}
