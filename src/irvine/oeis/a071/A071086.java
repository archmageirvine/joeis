package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071086 Number of integers of the form (nk)^2/(n^2+k^2), k&gt;=1.
 * @author Sean A. Irvine
 */
public class A071086 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n2 = ++mN * mN;
    long cnt = 0;
    for (long k = 1; k <= n2; ++k) {
      if (Z.valueOf(k * k).multiply(n2).mod(k * k + n2) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

