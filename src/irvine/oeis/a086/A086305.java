package irvine.oeis.a086;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A086305 Numbers such that two successive terms have no common digit and have distinct prime signature.
 * @author Sean A. Irvine
 */
public class A086305 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;
  private long mA = 2;

  @Override
  public Z next() {
    final Z sig = FactorUtils.leastPrimeSignature(mA);
    final int syn = Functions.SYNDROME.i(mA);
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        if ((syn & Functions.SYNDROME.i(k)) == 0 && !sig.equals(FactorUtils.leastPrimeSignature(k))) {
          mA = k;
          mUsed.set(k);
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}
