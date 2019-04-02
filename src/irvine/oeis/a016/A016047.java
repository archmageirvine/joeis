package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016047 Smallest prime factor of Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A016047 implements Sequence {

  private final Fast mPrime = new Fast();
  protected long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Jaguar.factor(Z.ONE.shiftLeft((int) mP).subtract(1)).toZArray()[0];
  }
}
