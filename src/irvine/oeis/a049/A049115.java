package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049115 a(n) is the number of iterations of the Euler phi function needed to reach a power of 2, when starting from n.
 * @author Sean A. Irvine
 */
public class A049115 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    if ((n & (n - 1)) == 0) {
      return Z.ZERO;
    }
    long cnt = 1;
    while (n != 1) {
      n = LongUtils.phi(n);
      if ((n & (n - 1)) != 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

