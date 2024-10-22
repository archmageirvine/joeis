package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072704 Triangle of number of weakly unimodal partitions/compositions of n into exactly k terms.
 * @author Sean A. Irvine
 */
public class A072704 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      if (i > n) {
        return RING.zero();
      }
      Polynomial<Z> s = n % i == 0 ? RING.monomial(Z.ONE, n / i) : RING.zero();
      for (int j = 0; j <= n / i; ++j) {
        s = RING.add(s, RING.multiply(get(n - i * j, i + 1), RING.monomial(Z.valueOf(j + 1), j)));
      }
      return s;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, 1).coeff(mM);
  }
}
