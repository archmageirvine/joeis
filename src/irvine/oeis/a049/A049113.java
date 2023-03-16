package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049113 Number of powers of 2 in sequence obtained when phi (A000010) is repeatedly applied to n.
 * @author Sean A. Irvine
 */
public class A049113 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long cnt = (n & (n - 1)) == 0 ? 1 : 0;
    while (n != 1) {
      n = Euler.phiAsLong(n);
      if ((n & (n - 1)) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

