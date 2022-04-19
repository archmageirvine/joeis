package irvine.oeis.a158;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A158190 Nonprime numbers with final digit prime.
 * @author Georg Fischer
 */
public class A158190 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long last = mN % 10;
        if (last == 2 || last == 3 || last == 5 || last == 7) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
