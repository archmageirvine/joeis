package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005928 G.f.: <code>s(1)^3/s(3)</code>, where <code>s(k) =</code> eta(q^k) and eta(q) is Dedekind's function, cf. A010815.
 * @author Sean A. Irvine
 */
public class A005928 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.pow(RING.eta(RING.x(), mN), 3, mN), RING.eta(X3, mN), mN);
  }
}
