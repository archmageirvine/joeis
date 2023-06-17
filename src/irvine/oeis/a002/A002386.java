package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002386 Primes (lower end) with record gaps to the next consecutive prime: primes p(k) where p(k+1) - p(k) exceeds p(j+1) - p(j) for all j &lt; k.
 * @author Sean A. Irvine
 */
public class A002386 extends AbstractSequence {

  /** Construct the sequence. */
  public A002386() {
    super(1);
  }

  protected final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mGap = Z.ZERO;
  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z a = mP;
      mP = mPrime.nextPrime(a);
      ++mN;
      final Z diff = mP.subtract(a);
      if (diff.compareTo(mGap) > 0) {
        mGap = diff;
        return a;
      }
    }
  }
}

