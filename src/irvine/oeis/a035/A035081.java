package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035081 Number of increasing asymmetric rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035081 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.create(Collections.singletonList(Q.ONE));

  static Polynomial<Q> egj(final Polynomial<Q> p) {
    Q f = Q.ONE;
    Polynomial<Q> egj = RING.one();
    final int n = p.degree();
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      egj = RING.multiply(egj, RING.pow(RING.onePlusXToTheN(f, k), p.coeff(k), n), n);
    }
    final Polynomial<Q> res = RING.empty();
    Z fac = Z.ONE;
    for (int k = 0; k <= egj.degree(); ++k) {
      if (k > 1) {
        fac = fac.multiply(k);
      }
      res.add(egj.coeff(k).multiply(fac));
    }
    return res;
  }

  @Override
  public Z next() {
    mA.add(mA.degree() < 3 ? Q.ONE : egj(egj(mA)).coeff(mA.degree()));
    return mA.coeff(mA.degree()).toZ();
  }
}
