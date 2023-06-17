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
 * A058861 Number of 3-connected rooted cubic planar maps with n faces and girth at least 4.
 * @author Sean A. Irvine
 */
public class A058861 extends AbstractSequence {

  /* Construct the sequence. */
  public A058861() {
    super(4);
  }

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>("z", INNER);
  private static final Polynomial<Polynomial<Z>> F = RING.create(Arrays.asList(
    INNER.zero(),
    Polynomial.create(0, 0, 1, -3)
  ));
  private static final Polynomial<Polynomial<Z>> G = RING.create(Arrays.asList(
    Polynomial.create(1, -8, 5, 1),
    Polynomial.create(-1, 14, -59, 82, -45, 4, 4),
    Polynomial.create(-3, -14, 36, -15, -10, 6).shift(4),
    Polynomial.create(-3, 2, 9, -12, 4).shift(8),
    Polynomial.create(-1, 3, -3, 1).shift(12)
  ));
  private static final Polynomial<Polynomial<Z>> DG = RING.diff(G);
  private int mN = 3;
  private Polynomial<Polynomial<Z>> mZ0 = RING.one();

  @Override
  public Z next() {
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>("z", new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, ++mN));
    mZ0 = ring.subtract(mZ0, ring.series(ring.substitute(G, mZ0, mN), ring.substitute(DG, mZ0, mN), mN));
    return RING.substitute(F, PolynomialUtils.innerShift(ring, mZ0, 4), mN).coeff(0).coeff(mN);
  }
}
