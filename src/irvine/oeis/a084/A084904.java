package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084904 Number of places to insert a division operator in the decimal string of n such that an integer results.
 * @author Sean A. Irvine
 */
public class A084904 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    long mod = 10;
    while (mod < mN) {
      final long q = mN % mod;
      final long p = mN / mod;
      if (q != 0 && p % q == 0) {
        ++cnt;
      }
      mod *= 10;
    }
    return Z.valueOf(cnt);
  }
}
