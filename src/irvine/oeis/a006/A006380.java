package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000721;

/**
 * A006380 Number of equivalence classes of 4 X n binary matrices when one can permute rows, permute columns and complement columns.
 * @author Sean A. Irvine
 */
public class A006380 extends A000721 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    final CycleIndex ci = f(n);
    final ArrayList<Polynomial<Q>> polys = new ArrayList<>();
    for (int k = 1; k <= Z.ONE.shiftLeft(n).min(Z.valueOf(m)).longValueExact(); ++k) {
      polys.add(RING.series(RING.one(), RING.oneMinusXToTheN(k), m));
    }
    final Polynomial<Q> p = ci.apply(polys, Z.valueOf(m));
    return p.coeff(m).toZ();
  }

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
