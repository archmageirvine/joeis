package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049824 a(n)=number of 3's in n-th row of array T given by A049816.
 * @author Sean A. Irvine
 */
public class A049824 extends A049816 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (t(mN, k) == 3) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
