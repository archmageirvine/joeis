package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077223 a(1) = 1 and then alternately even and odd numbers not occurring earlier such that the sum of any two successive terms is a squarefree number.
 * @author Sean A. Irvine
 */
public class A077223 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private Z mA = Z.ZERO;
  private long mS = 1;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    while (mSeen.isSet(mS)) {
      ++mS;
    }
    long k = mS;
    k = mEven ? (k & ~1) : (k | 1);
    while (mSeen.isSet(k) || !Predicates.SQUARE_FREE.is(mA.add(k))) {
      k += 2;
    }
    mSeen.set(k);
    mA = Z.valueOf(k);
    return mA;
  }
}

