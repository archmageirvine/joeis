package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A343644 a(n) is the sum of the number of occurrences of each digit of n up to and including that digit.
 * @author Sean A. Irvine
 */
public class A343644 extends Sequence1 {

  private final long[] mCounts = new long[10];
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 0;
    while (m != 0) {
      s += ++mCounts[(int) (m % 10)];
      m /= 10;
    }
    return Z.valueOf(s);
  }
}
