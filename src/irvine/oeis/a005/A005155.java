package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005155 Number of degree sequences of n-node graphs.
 * @author Sean A. Irvine
 */
public class A005155 extends Sequence0 {

  // After Michael Somos

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private final List<Q> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(Z.valueOf(mN).pow(mN), mF));
    final Polynomial<Q> a = RING.create(mA);
    final Polynomial<Q> b = RING.integrate(a);
    final Polynomial<Q> b1 = RING.subtract(RING.one(), b);
    final Polynomial<Q> c = RING.integrate(RING.series(RING.one(), b1, mN));
    final Polynomial<Q> s = RING.sqrt1p(RING.multiply(RING.subtract(a, RING.one()), Q.TWO), mN);
    final Polynomial<Q> e = RING.exp(c, mN);
    final Polynomial<Q> g = RING.multiply(RING.multiply(RING.add(RING.one(), RING.multiply(b1, s, mN)), Q.HALF), e, mN);
    return g.coeff(mN).multiply(mF).toZ();
  }
}
