package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069106 Composite numbers k such that k divides F(k-1) where F(j) are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A069106 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 441;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Fibonacci.fibonacci(mN - 1, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

