package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066413 Eisenstein-Mersenne primes: primes of the form ((3 +/- sqrt(-3))/2)^p - 1.
 * @author Sean A. Irvine
 */
public class A066413 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 0;

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 2;
      return Z.SEVEN;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = Z.THREE.pow(mP).subtract(Z.THREE.pow((mP + 1) / 2).multiply(LongUtils.kronecker(3, mP))).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

