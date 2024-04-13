package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003634 Smallest positive integer that is n times its digit sum, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A003634 extends Sequence1 {

  // Looking for least m such that m = n * digitSum(m).
  // Does not always exist. Note n | m.
  private static final long HEURISTIC_LIMIT = 10; // Is this provably enough?

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long m = mN; m < HEURISTIC_LIMIT * mN * mN; m += mN) {
      if (m == mN * Functions.DIGIT_SUM.l(m)) {
        return Z.valueOf(m);
      }
    }
    return Z.ZERO;
  }
}
