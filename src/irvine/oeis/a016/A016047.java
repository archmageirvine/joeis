package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A016047 Smallest prime factor of Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A016047 extends AbstractSequence {

  /* Construct the sequence. */
  public A016047() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  protected long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Jaguar.factor(Z.ONE.shiftLeft(mP).subtract(1)).leastPrimeFactor();
  }
}
