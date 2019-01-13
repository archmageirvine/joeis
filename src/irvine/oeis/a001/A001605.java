package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001605.
 * @author Sean A. Irvine
 */
public class A001605 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    if (mN == 3) {
      mN = 4;
      return Z.FOUR;
    }
    do {
      mN = mPrime.nextPrime(mN);
    } while (!Fibonacci.isFibonacciPrime(mN));
    return Z.valueOf(mN);
  }
}
