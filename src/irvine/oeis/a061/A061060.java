package irvine.oeis.a061;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061060.
 * @author Sean A. Irvine
 */
public class A061060 implements Sequence {

  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mPrimeList = new ArrayList<>();
  private Z mBest = null;
  private Z mPrimorial = Z.ONE;
  private Z mPrimorialSqrt = Z.ONE;

  private void search(final Z a, final Z b, final int k) {
    if (a.compareTo(mPrimorialSqrt) > 0) {
      return;
    }
    if (k == mPrimeList.size()) {
      mBest = mBest.min(b.subtract(a));
      return;
    }
    search(a.multiply(mPrimeList.get(k)), b, k + 1);
    search(a, b.multiply(mPrimeList.get(k)), k + 1);
  }

  @Override
  public Z next() {
    mPrimeList.add(mPrimeList.isEmpty() ? Z.TWO : mPrime.nextPrime(mPrimeList.get(mPrimeList.size() - 1)));
    mPrimorial = mPrimorial.multiply(mPrimeList.get(mPrimeList.size() - 1));
    mPrimorialSqrt = mPrimorial.sqrt();
    mBest = mPrimorial;
    search(Z.ONE, Z.ONE, 0);
    //System.out.println(mPrimeList.get(mPrimeList.size() - 1) + "# best = " + mBest);
    return mBest;
  }
}
