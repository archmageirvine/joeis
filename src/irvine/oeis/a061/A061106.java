package irvine.oeis.a061;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061106 Compute Euler totient function for the prime(n+1)-prime(n)-1 composite numbers between two consecutive primes; choose the smallest.
 * @author Sean A. Irvine
 */
public class A061106 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    Z t = super.next().add(1);
    Z min = Euler.phi(t);
    while (true) {
      t = t.add(1);
      if (mPrime.isPrime(t)) {
        return min;
      }
      min = min.min(Euler.phi(t));
    }
  }
}
