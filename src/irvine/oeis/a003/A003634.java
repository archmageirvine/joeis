package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A003634 Smallest positive number that is n times sum of its digits, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A003634 implements Sequence {

  // Looking for least m such that m = n * digitSum(m).
  // Does not always exist. Note n | m.
  private static final long LIMIT = 250; // Is this provably enough?

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long m = mN; m < LIMIT * mN; m += mN) {
      if (m == mN * ZUtils.digitSum(m)) {
        return Z.valueOf(m);
      }
    }
    return Z.ZERO;
  }
}
