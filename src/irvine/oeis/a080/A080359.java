package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.Sequence1;

/**
 * A080359 The smallest integer x &gt; 0 such that the number of primes in (x/2, x] equals n.
 * @author Sean A. Irvine
 */
public class A080359 extends InverseSequence {

  /** Construct the sequence. */
  public A080359() {
    super(1, new Sequence1() {
      private final Fast mPrime = new Fast();
      private long mN = 0;

      @Override
      public Z next() {
        ++mN;
        long cnt = 0;
        for (long p = mPrime.nextPrime(mN / 2); p <= mN; p = mPrime.nextPrime(p)) {
          ++cnt;
        }
        return Z.valueOf(cnt);
      }
    });
  }
}
