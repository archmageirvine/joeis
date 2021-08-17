package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a048.A048853;

/**
 * A050673 a(n) is the smallest prime such that the number of primes produced according to rules stipulated in Honaker's A048853 is n.
 * @author Sean A. Irvine
 */
public class A050673 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050673() {
    super(new A048853() {
      private final Fast mPrime = new Fast();

      @Override
      public Z next() {
        // Work around to only consider prime positions
        final Z t = super.next();
        return mPrime.isPrime(mN) ? t : Z.ZERO;
      }
    });
  }
}
