package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031213 Periods of sum of 10th powers of digits iterated until the sequence becomes periodic.
 * @author Sean A. Irvine
 */
public class A031213 extends Sequence0 {

  private long mN = -1;

  private static long digitSum10(final long n) {
    long m = Math.abs(n);
    long sum = 0;
    while (m != 0) {
      final long r = m % 10;
      final long s = r * r;
      final long t = s * s * r;
      sum += t * t;
      m /= 10;
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    long a = mN;
    long b = mN;
    do {
      a = digitSum10(a);
      b = digitSum10(digitSum10(b));
    } while (a != b);
    // a is definitely inside the period, so now count until we see it again
    long c = 0;
    do {
      a = digitSum10(a);
      ++c;
    } while (a != b);
    return Z.valueOf(c);
  }
}
