package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082607 a(0)=1; for n &gt; 0, a(n) = least k not included earlier such that k*a(n-1) - 1 is a square.
 * @author Sean A. Irvine
 */
public class A082607 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        if (Predicates.SQUARE.is(mA.multiply(k).subtract(1))) {
          mA = Z.valueOf(k);
          mUsed.set(k);
          return mA;
        }
      }
      ++k;
    }
  }
}
