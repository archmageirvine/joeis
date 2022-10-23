package irvine.oeis.a031;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031176 Periods of sum of squares of digits iterated until the sequence becomes periodic.
 * @author Sean A. Irvine
 */
public class A031176 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long a = mN;
    long b = mN;
    do {
      a = LongUtils.digitSumSquares(a);
      b = LongUtils.digitSumSquares(LongUtils.digitSumSquares(b));
    } while (a != b);
    // a is definitely inside the period, so now count until we see it again
    long c = 0;
    do {
      a = LongUtils.digitSumSquares(a);
      ++c;
    } while (a != b);
    return Z.valueOf(c);
  }
}
