package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049839 a(n) = Max_{k=1..n} T(n,k), array T as in A049837.
 * @author Sean A. Irvine
 */
public class A049839 extends A049837 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long k = 1; k <= mN; ++k) {
      max = Long.max(max, t(mN, k));
    }
    return Z.valueOf(max);
  }
}
