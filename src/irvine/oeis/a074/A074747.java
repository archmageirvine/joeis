package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074747 Largest difference between consecutive anti-divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A074747 extends A074746 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long max = 0;
    for (long d = 2; d < mN; ++d) {
      if (isAntidivisor(d, mN)) {
        if (k != 0) {
          final long diff = d - k;
          if (diff > max) {
            max = diff;
          }
        }
        k = d;
      }
    }
    return Z.valueOf(max);
  }
}
