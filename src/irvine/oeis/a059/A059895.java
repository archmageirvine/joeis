package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059895 Table a(i,j) = product prime[k]^(Ei[k] AND Ej[k]) where Ei and Ej are the vectors of exponents in the prime factorizations of i and j; AND is the bitwise operation on binary representation of the exponents.
 * @author Sean A. Irvine
 */
public class A059895 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    final FactorSequence nf = Jaguar.factor(n);
    final FactorSequence mf = Jaguar.factor(m);
    Z prod = Z.ONE;
    // We only need to look at one set of factors, AND is like intersection
    for (final Z np : nf.toZArray()) {
      final int ne = nf.getExponent(np);
      final int me = mf.getExponent(np);
      prod = prod.multiply(np.pow(ne & me));
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
