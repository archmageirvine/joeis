package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037019 Let n = p_1*p_2*...*p_k be the prime factorization of n, with the primes sorted in descending order. Then a(n) = 2^(p_1 - 1)*3^(p_2 - 1)*...*A000040(k)^(p_k - 1).
 * @author Sean A. Irvine
 */
public class A037019 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] p = fs.toZArray();
    Z prod = Z.ONE;
    long q = 1;
    for (int k = p.length - 1; k >= 0; --k) {
      final Z p1 = p[k].subtract(1);
      for (int j = 0; j < fs.getExponent(p[k]); ++j) {
        q = mPrime.nextPrime(q);
        prod = prod.multiply(Z.valueOf(q).pow(p1));
      }
    }
    return prod;
  }
}
