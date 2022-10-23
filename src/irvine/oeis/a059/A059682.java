package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A059682 Triangle T(n,k) giving number of 2 X k polyominoes with n cells (n &gt;= 2, 1&lt;=k&lt;=n-1).
 * @author Sean A. Irvine
 */
public class A059682 extends Sequence2 {

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(INNER);
  private static final Polynomial<Polynomial<Z>> NUM = RING.create(Arrays.asList(
    INNER.zero(),
    Polynomial.create(0, 0, 1),
    Polynomial.create(0, 0, 0, -1, -1),
    Polynomial.create(0, 0, 0, 0, 1, 0, -1),
    Polynomial.create(0, 0, 0, 0, 0, -1, 0, 0, 1),
    Polynomial.create(0, 0, 0, 0, 0, 0, 0, 1, -2, 1),
    Polynomial.create(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
    Polynomial.create(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1)
  ));
  private static final Polynomial<Polynomial<Z>> DEN = RING.create(Arrays.asList(
    INNER.one(),
    Polynomial.create(0, -2, -2),
    Polynomial.create(0, 0, 0, 2),
    Polynomial.create(0, 0, 0, 2, 2, 2, 2),
    Polynomial.create(0, 0, 0, 0, -1, -2, -4, -2, -1),
    Polynomial.create(0, 0, 0, 0, 0, 0, 0, 2, 2),
    Polynomial.create(0, 0, 0, 0, 0, 0, 0, 0, 0, -2),
    INNER.zero(),
    INNER.monomial(Z.ONE, 12)
  ));

  private int mN = 1;
  private int mM = 1;
  private Polynomial<Polynomial<Z>> mGf = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
      final PolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
      mGf = ring.series(NUM, DEN, mN);
    }
    return mGf.coeff(mM).coeff(mN);
  }
}
