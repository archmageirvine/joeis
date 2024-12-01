package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A073483 For the n-th squarefree number: the product of all primes greater than its smallest factor and less than its largest factor and not dividing it.
 * @author Sean A. Irvine
 */
public class A073483 extends A005117 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z n = super.next();
    final Z[] p = Jaguar.factor(n).toZArray();
    if (p.length <= 1) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
      if (!n.mod(q).isZero()) {
        prod = prod.multiply(q);
      }
    }
    return prod;
  }
}
