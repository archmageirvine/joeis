package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078173 Max[min(r,s,t)], where the maximum is taken over all positive integer solutions of the Diophantine equation rst=n(r+s+t).
 * @author Sean A. Irvine
 */
public class A078173 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long t = 1; t <= Functions.SQRT.l(3 * mN); ++t) {
      for (long s = t; s <= mN + Functions.SQRT.l(mN * mN + t); ++s) {
        final long d = s * t - mN;
        if (d != 0) {
          final long n = mN * (s + t);
          if (n % d == 0 && n / d >= s) {
            max = Math.max(max, Functions.MIN.l(s, t, d));
          }
        }
      }
    }
    return Z.valueOf(max);
  }
}
