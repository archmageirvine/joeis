package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a005.A005568;

/**
 * A004304.
 * @author Sean A. Irvine
 */
public class A004304 extends A005568 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private final ArrayList<Q> mF = new ArrayList<>();
  {
    mF.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    mF.add(new Q(super.next()));
    ++mN;
    final Polynomial<Q> p = RING.pow(RING.create(mF), 2, mN).shift(1);
    final Polynomial<Q> r = RING.series(RING.x(), RING.reversion(p, mN), mN);
    final Polynomial<Q> gf = RING.sqrt1p(RING.subtract(r, RING.one()), mN);
    return gf.coeff(mN - 1).toZ();
  }
}

