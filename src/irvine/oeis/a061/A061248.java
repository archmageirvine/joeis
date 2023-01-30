package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061248 Primes at which sum of digits strictly increases.
 * @author Sean A. Irvine
 */
public class A061248 extends Sequence1 {

  // After Eric M. Schmidt

  private final List<Integer> mNList = new ArrayList<>();
  private int mDigitSum = 3;
  private Z mN = Z.TWO;
  private final int mBase = 10;

  private int sum(final List<Integer> a) {
    int sum = 0;
    for (final int v : a) {
      sum += v;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (mNList.isEmpty()) {
      mNList.add(2);
    } else {
      while (!(mN.isProbablePrime() && sum(mNList) >= mDigitSum)) {
        int i = mNList.size();
        for (int j = 0; j < mNList.size(); ++j) {
          if (mNList.get(j) < mBase - 1) {
            i = j;
            break;
          }
        }
        if (i == mNList.size()) {
          mNList.add(0);
        }
        mNList.set(i, mNList.get(i) + 1);
        int r = mDigitSum;
        for (int j = i; j < mNList.size(); ++j) {
          r -= mNList.get(j);
        }
        for (int j = 0; j < i; ++j) {
          mNList.set(j, Math.min(r, mBase - 1));
          r -= mNList.get(j);
        }
        mN = Z.ZERO;
        Z b = Z.ONE;
        for (int j = 0; j < mNList.size(); ++j, b = b.multiply(mBase)) {
          mN = mN.add(b.multiply(mNList.get(j)));
        }
      }
      mDigitSum = sum(mNList) + 1;
    }
    return mN;
  }
}
