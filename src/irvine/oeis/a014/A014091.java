package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014091.
 * @author Sean A. Irvine
 */
public class A014091 implements Sequence {

  // Assumes Goldbach conjecture

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0 || mPrime.isPrime(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
