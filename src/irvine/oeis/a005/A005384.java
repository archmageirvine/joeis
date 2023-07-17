package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005384 Sophie Germain primes p: 2p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A005384 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005384(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005384() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.multiply2().add(1))) {
        return mP;
      }
    }
  }
}
