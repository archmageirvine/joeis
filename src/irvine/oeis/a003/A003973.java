package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003973 Inverse M\u00f6bius transform of A003961; a(n) = sigma(A003961(n)), where A003961 shifts the prime factorization of n one step towards the larger primes.
 * @author Sean A. Irvine
 */
public class A003973 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) + 1).subtract(1).divide(q.subtract(1)));
    }
    return prod;
  }
}
