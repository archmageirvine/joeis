package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084905 Smallest positive integer resulting after inserting division operator in the decimal string of n.
 * @author Sean A. Irvine
 */
public class A084905 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long res = ++mN;
    long mod = 10;
    while (mod < mN) {
      final long q = mN % mod;
      final long p = mN / mod;
      if (q != 0 && p % q == 0) {
        res = p / q;
      }
      mod *= 10;
    }
    return Z.valueOf(res);
  }
}
