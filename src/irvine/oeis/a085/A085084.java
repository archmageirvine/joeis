package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085084 Smallest number not yet used which is not a prime but is relatively prime to the previous term.
 * @author Sean A. Irvine
 */
public class A085084 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mLeastUnused = 4;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused) || Predicates.PRIME.is(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k) && Functions.GCD.l(mA, k) == 1 && !Predicates.PRIME.is(k)) {
        mA = k;
        mUsed.set(k);
        return Z.valueOf(mA);
      }
      ++k;
    }
  }
}
