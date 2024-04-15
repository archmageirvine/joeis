package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061120 Compute sum of divisors of the prime(n+1)-prime(n)-1 composite numbers between two consecutive primes; choose the smallest.
 * @author Sean A. Irvine
 */
public class A061120 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    Z t = super.next().add(1);
    Z min = Functions.SIGMA.z(t);
    while (true) {
      t = t.add(1);
      if (mPrime.isPrime(t)) {
        return min;
      }
      min = min.min(Functions.SIGMA.z(t));
    }
  }
}
