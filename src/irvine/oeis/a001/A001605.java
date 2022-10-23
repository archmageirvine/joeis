package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001605 Indices of prime Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001605 extends Sequence1 {

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
