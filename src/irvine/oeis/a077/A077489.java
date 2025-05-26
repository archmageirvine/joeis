package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A077489 a(n) = smallest multiple of 4 with sum of digits = n.
 * @author Sean A. Irvine
 */
public class A077489 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mM += 4;
      final long s = Functions.DIGIT_SUM.l(mM);
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

