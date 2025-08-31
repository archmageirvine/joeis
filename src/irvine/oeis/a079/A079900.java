package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079900 a(n) = the smallest positive number which furnishes a "one-line proof" for primality of prime(n), the n-th prime; i.e., the smallest k which is relatively prime to p such that k*(p+k) is divisible by every prime less than sqrt(p), where p=prime(n).
 * @author Sean A. Irvine
 */
public class A079900 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = Z.ONE;
    Z prod = Z.ONE;
    while (true) {
      q = mPrime.nextPrime(q);
      if (q.square().compareTo(p) > 0) {
        break;
      }
      prod = prod.multiply(q);
    }
    long k = 0;
    while (true) {
      if (Functions.GCD.l(p, ++k) == 1 && p.add(k).modMultiply(k, prod).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
