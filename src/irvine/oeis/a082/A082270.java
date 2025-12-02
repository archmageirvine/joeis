package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082270 a(1) = 1; for n &gt;= 1, a(n+1) = smallest number not occurring earlier such that a(n)*a(n+1) + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A082270 extends Sequence1 {

  private Z mA = null;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long m = mLeastUnused;
    while (true) {
      if (Predicates.PALINDROME.is(mA.multiply(m).add(1))) {
        mUsed.set(m);
        mA = Z.valueOf(m);
        return mA;
      }
      while (mUsed.isSet(++m)) {
        // do nothing
      }
    }
  }
}
