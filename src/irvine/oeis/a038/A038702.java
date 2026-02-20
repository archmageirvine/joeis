package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038702 a(n) = prime(n)^2 mod prime(n-1).
 * @author Sean A. Irvine
 */
public class A038702 extends AbstractSequence {

  private Z mP;
  private final Fast mPrime = new Fast();
  private int mExpon;

  /** Construct the sequence. */
  public A038702() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param expon exponent
   */
  public A038702(final int expon) {
    super(2);
    mExpon = expon;
    mP = Z.ONE;
    mP = mPrime.nextPrime(mP);
  }

  @Override
  public Z next() {
    final Z t = mP;
    mP = mPrime.nextPrime(mP);
    return mP.pow(mExpon).mod(t);
  }
}
