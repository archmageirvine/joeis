package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082271 Palindromes arising in A082270.
 * @author Sean A. Irvine
 */
public class A082271 extends Sequence1 {

  private Z mA = Z.ONE;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;

  @Override
  public Z next() {
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long m = mLeastUnused;
    while (true) {
      final Z t = mA.multiply(m).add(1);
      if (Predicates.PALINDROME.is(t)) {
        mUsed.set(m);
        mA = Z.valueOf(m);
        return t;
      }
      while (mUsed.isSet(++m)) {
        // do nothing
      }
    }
  }
}
