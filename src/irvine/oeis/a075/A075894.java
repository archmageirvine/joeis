package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075894 Average of four successive primes squared, (prime(n)^2 + prime(n+1)^2 + prime(n+2)^2 + prime(n+3)^2)/4, n&gt;=2.
 * @author Sean A. Irvine
 */
public class A075894 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mQ = Z.FIVE;
  private Z mR = Z.SEVEN;

  @Override
  public Z next() {
    final Z t = mP;
    mP = mQ;
    mQ = mR;
    mR = mPrime.nextPrime(mR);
    return t.square().add(mP.square()).add(mQ.square()).add(mR.square()).divide(4);
  }
}
