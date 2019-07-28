package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024894 Numbers k such that <code>5*k + 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A024894 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(5 * ++mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
