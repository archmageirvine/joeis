package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A032162 Shifts left 2 places under "CGK" (necklace, element, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032162 extends A032160 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> C = RING.monomial(Y_RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE)), 0);

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(C, product());
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 2).shift(-1)), Q.ONE).toZ();
  }
}
