package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073884 a(1)=2. Let S(k) = sum of k terms. If S(n) is prime then a(n+1) is the smallest prime not included earlier else a(n+1) is the smallest composite number not included earlier.
 * @author Sean A. Irvine
 */
public class A073884 extends Sequence0 {

  private Z mP = Z.TWO;
  private Z mC = Z.THREE;
  private Z mS = null;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
      return Z.TWO;
    }
    if (mPrime.isPrime(mS)) {
      mP = mPrime.nextPrime(mP);
      mS = mS.add(mP);
      return mP;
    } else {
      do {
        mC = mC.add(1);
      } while (mPrime.isPrime(mC));
      mS = mS.add(mC);
      return mC;
    }
  }
}

