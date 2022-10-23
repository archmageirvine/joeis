package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001175 Pisano periods (or Pisano numbers): period of Fibonacci numbers mod n.
 * @author Sean A. Irvine
 */
public class A001175 extends Sequence1 {

  private int mN = 0;

  /**
   * Find the Pisano period of a number
   * @param n number
   * @return period
   */
  public static long pisanoPeriod(final long n) {
    if (n == 1) {
      return 1;
    }
    // Algorithm due to T. D. Noe
    long aa = 1;
    long ab = 0;
    long k = 0;
    while (true) {
      ++k;
      final long s = (aa + ab) % n;
      aa = ab;
      ab = s;
      if (aa == 1 && ab == 0) {
        return k;
      }
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(pisanoPeriod(++mN));
  }
}
