package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023271 Primes p such that p, <code>p+6, p+12, p+18</code> are all primes.
 * @author Sean A. Irvine
 */
public class A023271 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(6)) && mFast.isPrime(p.add(12)) && mFast.isPrime(p.add(18))) {
        return p;
      }
    }
  }
}
