package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000813 Expansion of (sin x + cos x)/cos 4x.
 * @author Sean A. Irvine
 */
public class A000813 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> FOUR = RING.create(Arrays.asList(Q.ZERO, Q.FOUR));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> cs = RING.add(RING.cos(RING.x(), mN), RING.sin(RING.x(), mN));
    final Polynomial<Q> c4 = RING.cos(FOUR, mN);
    final Polynomial<Q> gf = RING.series(cs, c4, mN);
    return gf.coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
