package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046019 a(n) gives the number of different powers m^n for which the sum of the digits is equal to m.
 * @author Sean A. Irvine
 */
public class A046019 implements Sequence {

  private static final long HEURISTIC = 300;
  private long mN = -1;

  private long upper(final long n) {
    // Empirical upper bound
    return (long) (3 * n * Math.log(n) + HEURISTIC);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long k = 0;
    long cnt = 0;
    final long lim = upper(mN);
    while (k <= lim) {
      if (ZUtils.digitSum(Z.valueOf(++k).pow(mN)) == k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
