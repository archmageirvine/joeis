package irvine.oeis.a394;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a237.A237271;

/**
 * A394054 Irregular triangle read by rows: T(n,k) is the number of positive integers &lt;= n with exactly k 2-dense sublists of divisors.
 * @author Sean A. Irvine
 */
public class A394054 extends A237271 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mM = 0;
  private Polynomial<Z> mP = RING.zero();

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      mP = RING.add(mP, RING.monomial(Z.ONE, super.next().intValueExact()));
      mM = 1;
    }
    return mP.coeff(mM);
  }
}

