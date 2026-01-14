package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083173 Triangle read by rows: the n-th row contains the first n-1 multiples of prime(n) followed by the next multiple that will make the row sum a multiple of n.
 * @author Sean A. Irvine
 */
public class A083173 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private int mN = 0;
  private long mP = 1;
  private int mM = 0;
  private long mLeastUnused = 2;
  private long mRowSum = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mP = Functions.NEXT_PRIME.l(mP);
      ++mN;
      mM = 1;
      mRowSum = 0;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = (mLeastUnused / mP) * mP;
    if (k < mLeastUnused) {
      k += mP;
    }
    while (true) {
      if (!mUsed.isSet(k)) {
        if (mM < mN || (mRowSum + k) % mN == 0) {
          mRowSum += k;
          mUsed.set(k);
          return Z.valueOf(k);
        }
      }
      k += mP;
    }
  }
}

