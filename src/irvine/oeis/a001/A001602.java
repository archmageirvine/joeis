package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001602 Fibonacci entry points: <code>a(n) =</code> smallest m <code>&gt; 0</code> such that the n-th prime divides Fibonacci(m).
 * @author Sean A. Irvine
 */
public class A001602 implements Sequence {

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
