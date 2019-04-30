package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000711 Number of partitions of n, with three kinds of 1,2,3 and 4 and two kinds of 5,6,7,...
 * @author Sean A. Irvine
 */
public class A000711 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 0, 2, 0, 0, -1, -1, 1);
  private int mN = -1;

  protected Polynomial<Z> den() {
    return DEN;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = den();
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), 2, mN), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
