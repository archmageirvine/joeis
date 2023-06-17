package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A039731 a(n)=MAX{p(n) mod q, where prime q &lt; p(n)=n-th prime}.
 * @author Sean A. Irvine
 */
public class A039731 extends AbstractSequence {

  /** Construct the sequence. */
  public A039731() {
    super(2);
  }

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long max = 0;
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      final long r = mP % q;
      if (r > max) {
        max = r;
      }
    }
    return Z.valueOf(max);
  }
}
