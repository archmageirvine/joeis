package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.CyclotomicPolynomials;
import irvine.oeis.Sequence1;

/**
 * A054372 Table of resultants for cyclotomic polynomials phi_k(x) and phi_n(x).
 * @author Sean A. Irvine
 */
public class A054372 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final CyclotomicPolynomials mCyclotomicPolynomials = new CyclotomicPolynomials();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Polynomial<Z> a = mCyclotomicPolynomials.get(mN);
    final Polynomial<Z> b = mCyclotomicPolynomials.get(mM);
    return RING.resultant(a, b);
  }
}
