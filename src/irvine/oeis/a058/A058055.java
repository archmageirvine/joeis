package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A058055 a(n) is the smallest positive number m such that m^2 + n is the next prime &gt; m^2.
 * @author Sean A. Irvine
 */
public class A058055 extends Sequence1 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      mM = mM.add(1);
      final Z m2 = mM.square();
      final int t = mPrime.nextPrime(m2).subtract(m2).intValueExact();
      if (mA.get(t) == null) {
        mA.set(t, mM);
      }
    }
    return mA.get(mN);
  }
}
