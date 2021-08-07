package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049822 a(n) = 1 - tau(n) + Sum_{d|n} tau(d-1).
 * @author Sean A. Irvine
 */
public class A049822 extends A049816 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (t(mN, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
