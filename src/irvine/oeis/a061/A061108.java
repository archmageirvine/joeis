package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061108 Compute Euler totient function for the prime(n+1)-prime(n)-1 composite numbers between two consecutive primes; choose the largest.
 * @author Sean A. Irvine
 */
public class A061108 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    Z t = super.next();
    Z max = Z.ZERO;
    while (true) {
      t = t.add(1);
      if (mPrime.isPrime(t)) {
        return max;
      }
      max = max.max(Functions.PHI.z(t));
    }
  }
}
