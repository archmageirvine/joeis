package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391188 a(n) = floor( prime(n) / floor(log(prime(n))) ), where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A391188 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final CR p = CR.valueOf(mP);
    return mP.divide(p.log().floor());
  }
}

