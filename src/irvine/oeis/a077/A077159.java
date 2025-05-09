package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077159 Triangle in which n-th row contains smallest n numbers coprime to n which have not occurred earlier.
 * @author Sean A. Irvine
 */
public class A077159 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mM = -1;
  private long mS = 1;
  private long mK = 2;

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

