package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069107 Composite numbers k that divide Fibonacci(k+1).
 * @author Sean A. Irvine
 */
public class A069107 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 322;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Fibonacci.fibonacci(mN + 1, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

