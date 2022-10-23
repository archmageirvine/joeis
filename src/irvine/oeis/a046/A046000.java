package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A046000 a(n) is the largest number m equal to the sum of digits of m^n.
 * @author Sean A. Irvine
 */
public class A046000 extends Sequence0 {

  // After Jean-Fran&ccedil;ois Alcover

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
    long max = 0;
    final long lim = upper(mN);
    while (k <= lim) {
      if (ZUtils.digitSum(Z.valueOf(++k).pow(mN)) == k) {
        max = k;
      }
    }
    return Z.valueOf(max);
  }
}
