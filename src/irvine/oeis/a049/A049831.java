package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049831 a(n) = Max_{k=1..n} T(n,k), array T as in A049828.
 * @author Sean A. Irvine
 */
public class A049831 extends A049828 {

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
