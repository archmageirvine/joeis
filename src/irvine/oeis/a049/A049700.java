package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049700 a(n)=MAX{T(i,n-i): i=0,1,...,n}, array T as in A049695.
 * @author Sean A. Irvine
 */
public class A049700 extends A049695 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long k = 0; k <= mN; ++k) {
      max = Math.max(max, t(k, mN - k));
    }
    return Z.valueOf(max);
  }
}
