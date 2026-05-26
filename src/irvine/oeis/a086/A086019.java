package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086019 For p = prime(n), a(n) is the largest prime q such that pq is a base-2 pseudoprime; that is, 2^(pq-1) = 1 mod pq; a(n) is 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A086019 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z[] p = Jaguar.factor(Z.TWO.pow(mP.subtract(1)).subtract(1)).toZArray();
    for (int k = p.length - 1; k >= 0; --k) {
      final Z q = p[k];
      final Z pq = mP.multiply(q);
      if (Z.TWO.modPow(pq.subtract(1), pq).isOne()) {
        return q;
      }
    }
    return Z.ZERO;
  }
}
