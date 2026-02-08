package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083664 a(1) = 1, a(n) = if n mod 10 = 0 then n else smallest number m, not occurring earlier such that m*a(n-d) is a palindrome, where d = if n mod 10 = 1 then 2 else 1.
 * @author Sean A. Irvine
 */
public class A083664 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (++mN == 1) {
      mB = Z.ONE;
      return Z.ONE;
    }
    if (mN % 10 == 0) {
      mUsed.set(mN);
      mA = mB;
      mB = Z.valueOf(mN);
      return mB;
    }
    final Z t = mN % 10 == 1 ? mA : mB;
    long k = 1;
    while (true) {
      if (!mUsed.isSet(++k) && Predicates.PALINDROME.is(t.multiply(k))) {
        mUsed.set(k);
        mA = mB;
        mB = Z.valueOf(k);
        return mB;
      }
    }
  }
}
