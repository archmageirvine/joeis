package irvine.oeis.a031;

import irvine.math.function.Functions;
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
      a = Functions.DIGIT_SUM_SQUARES.l(a);
      b = Functions.DIGIT_SUM_SQUARES.l(Functions.DIGIT_SUM_SQUARES.l(b));
    } while (a != b);
    // a is definitely inside the period, so now count until we see it again
    long c = 0;
    do {
      a = Functions.DIGIT_SUM_SQUARES.l(a);
      ++c;
    } while (a != b);
    return Z.valueOf(c);
  }
}
