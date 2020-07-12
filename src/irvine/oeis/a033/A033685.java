package irvine.oeis.a033;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033685 Theta series of hexagonal lattice <code>A_2</code> with respect to deep hole.
 * @author Sean A. Irvine
 */
public class A033685 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private int mN = -1;
  
  @Override
  public Z next() {
    if (++mN % 3 != 1) {
      return Z.ZERO;
    }
    final int n = mN / 3;
    return RING.coeff(RING.pow(RING.eta(X3, n), 3, n), RING.eta(RING.x(), n), n).multiply(3);
  }
}
