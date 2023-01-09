package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060958 Gregorian Easter dates, starting after 2000-04-23, a(2000) = 54.
 * @author Sean A. Irvine
 */
public class A060958 extends AbstractSequence {

  // See https://en.wikipedia.org/wiki/Date_of_Easter

  /** Construct the sequence. */
  public A060958() {
    super(2001);
  }

  private long mN = 2000;

  @Override
  public Z next() {
    ++mN;
    final long a = mN % 19;
    final long b = mN / 100;
    final long c = mN % 100;
    final long d = b / 4;
    final long e = b % 4;
    final long g = (8 * b + 13) / 25;
    final long h = (19 * a + b - d - g + 15) % 30;
    final long i = c / 4;
    final long k = c % 4;
    final long l = (32 + 2 * e + 2 * i - h - k) % 7;
    final long m = (a + 11 * h + 19 * l) / 433;
    final long n = (h + l - 7 * m + 90) / 25;
    final long p = (h + l - 7 * m + 33 * n + 19) % 32;
    return Z.valueOf((n - 3) * 31 + p);
  }
}
