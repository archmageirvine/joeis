package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002378;
import irvine.util.array.LongDynamicArray;

/**
 * A083001 Smallest oblong number having n prime divisors (with multiplicity).
 * @author Sean A. Irvine
 */
public class A083001 extends Sequence1 {

  private final Sequence mA = new A002378();
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z oblong = mA.next();
      final long omega = Functions.BIG_OMEGA.l(oblong);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, oblong);
      }
    }
    return mFirsts.get(mN);
  }
}
