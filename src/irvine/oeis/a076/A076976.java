package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076976 Product of the smallest prime divisors of composite numbers between successive primes.
 * @author Sean A. Irvine
 */
public class A076976 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    Z prod = Z.ONE;
    for (Z t = p.add(1); t.compareTo(q) < 0; t = t.add(1)) {
      prod = prod.multiply(Functions.LPF.z(t));
    }
    return prod;
  }
}

