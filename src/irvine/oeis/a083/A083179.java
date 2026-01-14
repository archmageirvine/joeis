package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083179 a(1)=1, a(n) = smallest positive integer not included earlier such that the partial sums of a(A000040) are prime and the partial sums of a(A002808) are composite.
 * @author Sean A. Irvine
 */
public class A083179 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mSumP = 0;
  private long mSumC = 0;
  private long mLeastUnused = 2;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    final boolean prime = Predicates.PRIME.is(mN);
    while (true) {
      while (mUsed.isSet(k)) {
        ++k;
      }
      if (prime) {
        if (Predicates.PRIME.is(mSumP + k)) {
          mUsed.set(k);
          mSumP += k;
          return Z.valueOf(k);
        }
      } else {
        if (!Predicates.PRIME.is(mSumC + k)) {
          mUsed.set(k);
          mSumC += k;
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}

