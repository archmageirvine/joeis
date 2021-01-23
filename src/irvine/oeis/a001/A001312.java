package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001312 Number of ways of making change for n cents using coins of 1, 2, 5, 10, 50, 100 cents.
 * @author Sean A. Irvine
 */
public class A001312 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mDen = den();

  protected int[] coins() {
    return new int[] {1, 2, 5, 10, 50, 100};
  }

  protected Polynomial<Z> den() {
    Polynomial<Z> p = RING.one();
    for (final int c : coins()) {
      p = RING.multiply(p, RING.oneMinusXToTheN(c));
    }
    return p;
  }


  @Override
  public Z next() {
    return RING.coeff(RING.one(), mDen, ++mN);
  }
}
