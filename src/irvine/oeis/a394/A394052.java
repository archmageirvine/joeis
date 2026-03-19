package irvine.oeis.a394;

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
  private Polynomial<Z> mP = RING.zero();

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      ++mN;
      mP = RING.add(mP, RING.monomial(Z.ONE, Functions.SIGMA0.i(mN)));
      mM = 1;
    }
    return mP.coeff(mM);
  }
}

