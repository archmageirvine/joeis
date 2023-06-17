package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006562 Balanced primes (of order one): primes which are the average of the previous prime and the following prime.
 * @author Sean A. Irvine
 */
public class A006562 extends AbstractSequence {

  /* Construct the sequence. */
  public A006562() {
    super(1);
  }

  protected final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z prev = mP;
      mP = mPrime.nextPrime(mP);
      if (prev.add(mPrime.nextPrime(mP)).equals(mP.multiply2())) {
        return mP;
      }
    }
  }
}
