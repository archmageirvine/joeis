package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001751 Primes together with primes multiplied by 2.
 * @author Sean A. Irvine
 */
public class A001751 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.TWO;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    final Z t = mN.multiply2();
    if (t.compareTo(mP) <= 0) {
      mN = mPrime.nextPrime(mN);
      return t;
    } else {
      final Z r = mP;
      mP = mPrime.nextPrime(mP);
      return r;
    }
  }
}
