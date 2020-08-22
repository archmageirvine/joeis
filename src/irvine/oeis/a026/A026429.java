package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A026429 Position of n-th odd prime in A026417.
 * @author Sean A. Irvine
 */
public class A026429 extends A026417 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mM = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z t;
    do {
      t = super.next();
      ++mM;
    } while (!t.equals(mP));
    return Z.valueOf(mM);
  }
}
