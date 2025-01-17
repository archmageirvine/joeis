package irvine.oeis.a074;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074246 Triangle of coefficients, read by rows, where the n-th row forms the polynomial P(n,x) = {Sum_{k=1..n} 1/(k+x)}*{Product_{k=1..n} (k+x)}.
 * @author Sean A. Irvine
 */
public class A074246 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mP = RING.zero();

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      ++mN;
      mM = 0;
      final Polynomial<Z> prod = RING.product(1, mN, k -> Polynomial.create(k, 1));
      mP = RING.sum(1, mN, k -> RING.series(prod, Polynomial.create(k, 1), mN));
    }
    return mP.coeff(mM);
  }
}
