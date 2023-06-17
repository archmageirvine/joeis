package irvine.oeis.a060;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060063 Triangle of coefficients of certain polynomials used for G.f.s of columns of triangle A060058.
 * @author Sean A. Irvine
 */
public class A060063 extends AbstractSequence {

  /* Construct the sequence. */
  public A060063() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = RING.pow(RING.oneMinusXToTheN(1), 2).shift(1);
  private int mN = 0;
  private int mM = -1;
  private Polynomial<Z> mA = RING.one();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final Polynomial<Z> d1 = RING.diff(mA);
      final Polynomial<Z> d2 = RING.diff(d1);
      final Polynomial<Z> a = RING.multiply(d2, C1 , mN);
      final Polynomial<Z> b = RING.multiply(d1, Polynomial.create(1, 6L * (mN - 1), 5 - 6L * mN), mN);
      final Polynomial<Z> c = RING.multiply(mA, Polynomial.create(3L * mN - 2, (3L * mN - 2) * (3L * mN - 2)), mN);
      mA = RING.add(a, b, c);
    }
    return mA.coeff(mM);
  }
}
