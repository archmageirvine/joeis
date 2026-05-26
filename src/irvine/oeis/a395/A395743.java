package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395743 Sum of the cumulative number of previous occurrences of the digits of n in the sequence 1..n excluding the current occurrence of each digit.
 * @author Sean A. Irvine
 */
public class A395743 extends Sequence1 {

  private final long[] mCounts = new long[10];
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 0;
    while (m != 0) {
      s += mCounts[(int) (m % 10)]++;
      m /= 10;
    }
    return Z.valueOf(s);
  }
}
