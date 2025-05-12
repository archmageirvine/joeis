package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077220 a(1) = 1; thereafter a(n) is smallest number not occurring earlier such that a(n-1)+a(n) is a triangular number.
 * @author Sean A. Irvine
 */
public class A077220 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private Z mA = Z.ZERO;
  private long mS = 1;

  @Override
  public Z next() {
    while (mSeen.isSet(mS)) {
      ++mS;
    }
    long k = mS;
    while (mSeen.isSet(k) || !Predicates.TRIANGULAR.is(mA.add(k))) {
      ++k;
    }
    mSeen.set(k);
    mA = Z.valueOf(k);
    return mA;
  }
}

