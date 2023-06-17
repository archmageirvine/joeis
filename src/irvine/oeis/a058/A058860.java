package irvine.oeis.a058;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058860 Number of 2-connected rooted cubic planar maps with n faces.
 * @author Sean A. Irvine
 */
public class A058860 extends AbstractSequence {

  /* Construct the sequence. */
  public A058860() {
    super(4);
  }

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>("z", INNER);
  private static final Polynomial<Polynomial<Z>> G = RING.create(Arrays.asList(
    Polynomial.create(-1, 13, -3, -1),
    Polynomial.create(1, -14, 3, -40, -5, 6, 1),
    Polynomial.create(0, 0, 8, 72, 24, 8),
    INNER.monomial(Z.valueOf(16), 4)
  ));
  private static final Polynomial<Polynomial<Z>> DG = RING.diff(G);
  private int mN = 3;
  private Polynomial<Polynomial<Z>> mZ0 = RING.one();

  @Override
  public Z next() {
    ++mN;
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>("z", new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN));
    mZ0 = ring.subtract(mZ0, ring.series(ring.substitute(G, mZ0, mN), ring.substitute(DG, mZ0, mN), mN));
    final Polynomial<Z> f1 = INNER.series(Polynomial.create(1, -2).shift(2), Polynomial.create(1, 1), mN);
    final Polynomial<Polynomial<Z>> f = RING.create(Arrays.asList(INNER.negate(f1).shift(1), f1));
    return RING.substitute(f, PolynomialUtils.innerShift(ring, mZ0, 1), mN).coeff(0).coeff(mN);
  }
}
