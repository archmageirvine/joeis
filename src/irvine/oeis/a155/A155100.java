package irvine.oeis.a155;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A155100 Triangle read by rows: coefficients in polynomials P_n(u) arising from the expansion of D^(n-1) (tan <code>x)</code> in increasing powers of tan x for <code>n&gt;=1</code> and 1 for <code>n=0</code>.
 * @author Sean A. Irvine
 */
public class A155100 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mP = RING.one();
  private int mN = -1;

  private void step() {
    if (mP.degree() == 0) {
      mP = RING.x();
    } else {
      mP = RING.multiply(RING.diff(mP), C);
    }
  }

  @Override
  public Z next() {
    if (++mN > mP.degree()) {
      mN = 0;
      step();
    }
    return mP.coeff(mN);
  }

}
