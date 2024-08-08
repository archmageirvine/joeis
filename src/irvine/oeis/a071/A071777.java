package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071771.
 * @author Sean A. Irvine
 */
public class A071777 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (Fibonacci.fibonacci(mN, mP) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
