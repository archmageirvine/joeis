package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075339 extends Sequence1 {

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
      Z t = mA;
      long p = 1;
      while (true) {
        p = mPrime.nextPrime(p);
        final Z u = t.add(p);
        if (!u.isProbablePrime()) {
          mA = u;
          return mA;
        }
      }
    } else {
      Z t = mA;
      while (true) {
        t = mPrime.nextPrime(t);
        final Z diff = t.subtract(mA);
        if (!Z.ONE.equals(diff) && !diff.isProbablePrime()) {
          mA = t;
          return mA;
        }
      }
    }
  }
}
