package irvine.oeis.a136;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A136612 a(n) = ((prime(n+3) + prime(n+1)) - (prime(n+2) + prime(n))).
 * @author Georg Fischer
 */
public class A136612 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private Z mP0 = Z.TWO;
  private Z mP1 = Z.THREE;
  private Z mP2 = Z.FIVE;
  private Z mP3 = Z.SEVEN;

  /** Construct the sequence. */
  public A136612() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mP3.add(mP1).subtract(mP2.add(mP0));
    mP0 = mP1;
    mP1 = mP2;
    mP2 = mP3;
    mP3 = mPrime.nextPrime(mP3);
    return result;
  }
}
