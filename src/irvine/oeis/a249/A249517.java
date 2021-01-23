package irvine.oeis.a249;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A249517 Numbers n for which the digital sum A007953(n) and the digital product A007954(n) both contain the same distinct digits as the number n.
 * @author Sean A. Irvine
 */
public class A249517 implements Sequence {

  private long mN = -1;

  private static boolean test(long n) {
    // NB this gives wrong answer for n == 0 due to init of p == 1
    // The case of 0 is dealt with directly in the next() method
    int s = 0;
    long d = 0;
    long p = 1;
    while (n != 0) {
      final long r = n % 10;
      n /= 10;
      s |= 1 << r;
      d += r;
      p *= r;
      if (p == 0 && s > 1) {
        return false; // will never match
      }
    }
    return s == LongUtils.syndrome(d) && s == LongUtils.syndrome(p);
  }

  @Override
  public Z next() {
    assert test(11111111111L);
    while (++mN > 0) {
      if (test(mN)) {
        return Z.valueOf(mN);
      }
    }
    if (mN == 0) {
      return Z.ZERO;
    }
    throw new UnsupportedOperationException();
  }

  /**
   * Main to explicitly search a subrange.
   * @param args start and end
   */
  public static void main(final String[] args) {
    final long start = Long.parseLong(args[0]);
    final long end = Long.parseLong(args[1]);
    for (long k = start; k < end; ++k) {
      if (test(k)) {
        System.out.println(k);
      }
    }
    System.out.println("Done");
  }
}
