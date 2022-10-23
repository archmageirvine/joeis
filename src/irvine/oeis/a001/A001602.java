package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001602 Fibonacci entry points: a(n) = smallest m &gt; 0 such that the n-th prime divides Fibonacci(m).
 * @author Sean A. Irvine
 */
public class A001602 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long a = 0;
    long b = 1;
    long m = 2;
    while (true) {
      final long t = (a + b) % mP;
      a = b;
      b = t;
      if (t == 0) {
        break;
      }
      ++m;
    }
    return Z.valueOf(m);
  }
}
