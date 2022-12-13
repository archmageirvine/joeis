package irvine.oeis.a261;
// manually anopan 1,1

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A261465 a(n) = prime(n+1)^2 - prime(n).
 * @author Georg Fischer
 */
public class A261465 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private Z mP1 = Z.TWO;
  private Z mP0;

  /** Construct the sequence. */
  public A261465() {
    super(1);
  }

  @Override
  public Z next() {
    mP0 = mP1;
    mP1 = mPrime.nextPrime(mP1);
    return mP1.square().subtract(mP0);
  }
}
