package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069799 The number obtained by reversing the sequence of nonzero exponents in the prime factorization of n with respect to distinct primes present, as ordered by their indices.
 * @author Sean A. Irvine
 */
public class A069799 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] p = fs.toZArray();
    Z prod = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      prod = prod.multiply(p[k].pow(fs.getExponent(p[p.length - k - 1])));
    }
    return prod;
  }
}

