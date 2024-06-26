package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.Collections;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034442 Arrange digits of primes in ascending order (omitting any that contain 0's), then sort list.
 * @author Sean A. Irvine
 */
public class A034442 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mA = new ArrayList<>();
  private int mM = 0;
  private Z mLim = Z.ONE;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      mLim = mLim.multiply(10);
      do {
        if (!mP.toString().contains("0")) {
          mA.add(Functions.DIGIT_SORT_ASCENDING.z(mP));
        }
        mP = mPrime.nextPrime(mP);
      } while (mP.compareTo(mLim) < 0);
      Collections.sort(mA);
      mM = 0;
    }
    return mA.get(mM);
  }
}
