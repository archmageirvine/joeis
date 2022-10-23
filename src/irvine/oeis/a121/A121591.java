package irvine.oeis.a121;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A121591 Expansion of (eta(q^5) / eta(q))^6 in powers of q.
 * @author Sean A. Irvine
 */
public class A121591 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X5 = Polynomial.create(0, 0, 0, 0, 0, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> p = RING.pow(RING.series(RING.eta(X5, mN), RING.eta(RING.x(), mN), mN), 6, mN);
    return p.coeff(mN);
  }
}
