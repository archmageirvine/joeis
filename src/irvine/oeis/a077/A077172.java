package irvine.oeis.a077;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077172 Triangle formed by grouping the natural numbers so that the n-th row contains n numbers whose product has exactly n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A077172 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private FactorSequence mFactorSequence = null;
  private int mN = 0;
  private int mM = 0;
  private long mS = 1;
  private long mK = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mFactorSequence = new FactorSequence();
      while (mUsed.isSet(mS)) {
        ++mS;
      }
      mK = mS;
    }
    while (true) {
      if (!mUsed.isSet(mK)) {
        final FactorSequence fs = new FactorSequence(mFactorSequence);
        fs.add(mK);
        Jaguar.factor(fs);
        final int omega = fs.omega();
        if (omega <= mN && (mM < mN - 1 || omega == mN)) {
          mUsed.set(mK);
          mFactorSequence = fs;
          return Z.valueOf(mK);
        }
      }
      ++mK;
    }
  }
}

