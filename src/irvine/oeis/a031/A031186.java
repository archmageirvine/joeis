package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A031186 Periods of sum of 5th powers of digits iterated until the sequence becomes periodic.
 * @author Sean A. Irvine
 */
public class A031186 extends AbstractSequence {

  /** Construct the sequence. */
  public A031186() {
    super(0);
  }

  protected long mN = -1;

  private static long digitSum5(final long n) {
    long m = Math.abs(n);
    long sum = 0;
    while (m != 0) {
      final long r = m % 10;
      sum += r * r * r * r * r;
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
      a = digitSum5(a);
      b = digitSum5(digitSum5(b));
    } while (a != b);
    // a is definitely inside the period, so now count until we see it again
    long c = 0;
    do {
      a = digitSum5(a);
      ++c;
    } while (a != b);
    return Z.valueOf(c);
  }
}
