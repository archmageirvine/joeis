package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394052 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A394052 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunction1<Polynomial<Z>> mB = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      return n == 0 ? RING.zero() : RING.add(get(n - 1), RING.monomial(Z.ONE, Functions.SIGMA0.i(n)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mB.get(mN).degree()) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN).coeff(mM);
  }
}

