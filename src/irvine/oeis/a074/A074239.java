package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a065.A065091;

/**
 * A074239 Related to cumulative number of non-twin primes.
 * @author Sean A. Irvine
 */
public class A074239 extends PrependSequence {

  /** Construct the sequence. */
  public A074239() {
    super(0, new A065091() {
      private long mCount = 0;

      @Override
      public Z next() {
        final Z p = super.next();
        if (!mPrime.isPrime(p.add(2))) {
          ++mCount;
        }
        return Z.valueOf(mCount);
      }
    }, 0);
  }
}
