package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A071390 Least number m such that sigma(m) - phi(m) = n, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A071390 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    } else if (mN == 2) {
      return Z.TWO;
    }
    while (mFirsts.get(mN) == 0 && 4 * mM < (long) mN * mN) {
      final int s = Functions.SIGMA1.z(mM).subtract(Functions.PHI.l(mM)).intValueExact();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
      ++mM;
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
