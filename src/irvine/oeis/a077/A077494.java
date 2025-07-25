package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A077494 a(n) = smallest k such that the digit sum of 7k is n.
 * @author Sean A. Irvine
 */
public class A077494 extends Sequence2 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long s = Functions.DIGIT_SUM.l(7 * mM);
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

