package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049076 Number of steps in the prime index chain for the n-th prime.
 * @author Sean A. Irvine
 */
public class A049076 extends A000040 {

  @Override
  public Z next() {
    long cnt = 0;
    long p = super.next().longValueExact();
    do {
      ++cnt;
      p = Functions.PRIME_PI.l(p);
    } while (mPrime.isPrime(p));
    return Z.valueOf(cnt);
  }
}
