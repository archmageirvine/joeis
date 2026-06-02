package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A085101 Palindromes arising in A085100.
 * @author Sean A. Irvine
 */
public class A085101 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mLeastUnused = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      if ((++mN & 1) == 0) {
        mA.set(mN, mLeastUnused);
        mUsed.set(mLeastUnused);
      } else {
        long s = 0;
        for (long k = mN - 1; k > mN / 2; --k) {
          s += mA.get(k);
        }
        long j = mLeastUnused;
        while (mUsed.isSet(j) || !Predicates.PALINDROME.is(s + j)) {
          ++j;
        }
        mA.set(mN, j);
        mUsed.set(j);
        return Z.valueOf(s + j);
      }
    }
  }
}

