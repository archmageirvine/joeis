package irvine.oeis.a058;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058859 Number of 1-connected rooted cubic planar maps with n faces.
 * @author Sean A. Irvine
 */
public class A058859 implements Sequence {

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>("z", INNER);
  private static final Polynomial<Polynomial<Z>> F = RING.create(Arrays.asList(
    INNER.zero(),
    Polynomial.create(1, -2, -4).shift(4),
    INNER.monomial(Z.TWO.negate(), 8)
  ));
  private static final Polynomial<Polynomial<Z>> G = RING.create(Arrays.asList(
    Polynomial.create(1, -11, -1),
    Polynomial.create(-1, 16, -46, -70, -33, -2),
    Polynomial.create(0, 0, 0, 1, -92, -194, -108, -15),
    Polynomial.create(72, 32, -24).shift(7),
    INNER.monomial(Z.valueOf(16), 11)
  ));
  private static final Polynomial<Polynomial<Z>> DG = RING.diff(G);
  private int mN = 3;
  private Polynomial<Polynomial<Z>> mZ0 = RING.one();

  @Override
  public Z next() {
    ++mN;
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>("z", new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN));
    mZ0 = ring.subtract(mZ0, ring.series(ring.substitute(G, mZ0, mN), ring.substitute(DG, mZ0, mN), mN));
    return RING.substitute(F, mZ0, mN).coeff(0).coeff(mN);
  }
}
