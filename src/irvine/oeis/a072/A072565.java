package irvine.oeis.a072;
// manually anopan 1,1

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072565 a(n) = prime(n+1)*prime(n+2)+1 mod prime(n), where prime(n) is the n-th prime.
 * @author Georg Fischer
 */
public class A072565 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP0 = Z.ONE;
  private Z mP1 = Z.TWO;
  private Z mP2 = Z.THREE;

  @Override
  public Z next() {
    mP0 = mP1;
    mP1 = mP2;
    mP2 = mPrime.nextPrime(mP2);
    return mP1.multiply(mP2).add(1).mod(mP0);
  }
}
