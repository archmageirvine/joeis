package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A031178 Periods of sum of cubes of digits iterated until the sequence becomes periodic.
 * @author Sean A. Irvine
 */
public class A031178 extends AbstractSequence {

  /* Construct the sequence. */
  public A031178() {
    super(0);
  }

  protected long mN = -1;

  /**
   * Return the sums of the cubes of the digits of a number
   * @param n the number
   * @return sum of cubes of digits of <code>n</code>
   */
  public static long digitSumCubes(final long n) {
    long m = Math.abs(n);
    long sum = 0;
    while (m != 0) {
      final long r = m % 10;
      sum += r * r * r;
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
      a = digitSumCubes(a);
      b = digitSumCubes(digitSumCubes(b));
    } while (a != b);
    // a is definitely inside the period, so now count until we see it again
    long c = 0;
    do {
      a = digitSumCubes(a);
      ++c;
    } while (a != b);
    return Z.valueOf(c);
  }
}
