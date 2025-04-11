package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076636 a(1) = 1, a(2n) = smallest prime &gt; (2n-1)-th partial sum of the sequence itself and a(2n+1) = smallest composite number &gt; 2n-th partial sum of the sequence.
 * @author Sean A. Irvine
 */
public class A076636 extends Sequence1 {

  private final Fast mPrime = new Fast();

  private Z mSum = Z.ZERO;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mSum.isZero()) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    mEven = !mEven;
    Z t;
    if (mEven) {
      t = mPrime.nextPrime(mSum);
    } else {
      t = mSum.add(1);
      if (t.isProbablePrime()) {
        t = t.add(1);
      }
    }
    mSum = mSum.add(t);
    return t;
  }
}
