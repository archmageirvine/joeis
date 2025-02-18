package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075341 a(1) = 1, a(2n) is the smallest composite number == 1 mod (a(2n-1)) and a(2n+1) is the smallest prime == 1 (mod a(2n)).
 * @author Sean A. Irvine
 */
public class A075341 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mEven = !mEven;
    if (mEven) {
      if (Z.ONE.equals(mA)) {
        mA = Z.FOUR;
        return mA;
      }
      Z t = mA;
      while (true) {
        t = t.add(1);
        if (!t.isProbablePrime() && t.mod(mA).equals(Z.ONE)) {
          mA = t;
          return mA;
        }
      }
    } else {
      Z t = mA;
      while (true) {
        t = mPrime.nextPrime(t);
        if (t.mod(mA).equals(Z.ONE)) {
          mA = t;
          return mA;
        }
      }
    }
  }
}
