package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003972 Moebius transform of A003961; a(n) = phi(A003961(n)), where A003961 shifts the prime factorization of n one step towards the larger primes.
 * @author Sean A. Irvine
 */
public class A003972 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1).multiply(q.subtract(1)));
    }
    return prod;
  }
}
