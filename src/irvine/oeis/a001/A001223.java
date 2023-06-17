package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001223 Prime gaps: differences between consecutive primes.
 * @author Sean A. Irvine
 */
public class A001223 extends AbstractSequence {

  /** Construct the sequence. */
  public A001223() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    final Z p = mP;
    mP = mPrime.nextPrime(mP);
    return mP.subtract(p);
  }
}
