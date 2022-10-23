package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051237 Lexicographically earliest prime pyramid, read by rows.
 * @author Sean A. Irvine
 */
public class A051237 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int[] mRow = {1};
  private boolean[] mUsed = null;
  private int mN = 1;
  private int mM = -1;

  private boolean fillRow(final int n) {
    if (n >= mRow.length - 1) {
      return mPrime.isPrime(mRow[mRow.length - 1] + mRow[mRow.length - 2]);
    }
    // Take advantage of parity, and 1 already used
    for (int k = 3 - (mRow[n - 1] & 1); k < mN; k += 2) {
      if (!mUsed[k] && mPrime.isPrime(k + mRow[n - 1])) {
        mUsed[k] = true;
        mRow[n] = k;
        if (fillRow(n + 1)) {
          return true;
        }
        mUsed[k] = false;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = new int[++mN];
      mUsed = new boolean[mN + 1];
      mRow[0] = 1;
      mRow[mRow.length - 1] = mN;
      mUsed[1] = true;
      mUsed[mN] = true;
      fillRow(1);
    }
    return Z.valueOf(mRow[mM]);
  }
}
