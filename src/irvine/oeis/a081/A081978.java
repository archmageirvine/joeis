package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A081978 Smallest triangular number with exactly n divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A081978 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN > 2 && Predicates.PRIME.is(mN)) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == null) {
      final Z t = Functions.TRIANGULAR.z(++mM);
      final long s = Functions.SIGMA0.l(t);
      if (mFirsts.get(s) == null) {
        mFirsts.set(s, t);
      }
    }
    return mFirsts.get(mN);
  }
}
