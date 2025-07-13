package irvine.oeis.a385;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A385644 Swap multiplication and exponentiation in the canonical prime factorization of n.
 * @author Sean A. Irvine
 */
public class A385644 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] primes = fs.toZArray();
    Z res = Z.ONE;
    for (int k = primes.length - 1; k >= 0; --k) {
      final Z p = primes[k];
      res = p.multiply(fs.getExponent(p)).pow(res);
    }
    return res;
  }
}

