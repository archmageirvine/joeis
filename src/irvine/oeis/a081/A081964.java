package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081964 In the following triangle the n-th row contains n numbers relatively prime to n and not occurring in a previous row. a(1) = 1. Sequence contains the triangle by rows.
 * @author Sean A. Irvine
 */
public class A081964 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mM = -1;
  private long mS = 1;
  private long mK = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      while (mUsed.isSet(mS)) {
        ++mS;
      }
      mK = mS;
    }
    while (true) {
      if (!mUsed.isSet(mK) && Functions.GCD.l(mN, mK) == 1) {
        mUsed.set(mK);
        return Z.valueOf(mK);
      }
      ++mK;
    }
  }
}

