package irvine.oeis.a077;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077584.
 * @author Sean A. Irvine
 */
public class A077599 extends A074586 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = Polynomial.create(Q.ONE, Q.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Polynomial<Q> p = RING.empty();
      for (int k = 0; k < mN; ++k) {
        p.add(new Q(super.next()));
      }
      if (RING.eval(p, Q.NEG_ONE).isZero()) {
        final Polynomial<Q> q = RING.divide(p, C);
        if (RING.eval(q, Q.NEG_ONE).isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
