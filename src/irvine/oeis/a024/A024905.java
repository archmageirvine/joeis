package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024905 Numbers k such that <code>7*k + 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A024905 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(7 * ++mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
