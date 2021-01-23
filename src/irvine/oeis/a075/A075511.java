package irvine.oeis.a075;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A075511 Sixth column of triangle A075497.
 * @author Sean A. Irvine
 */
public class A075511 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mProd;
  private int mN;

  protected A075511(final int offset, final int kMax, final long factor) {
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= kMax; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(Z.valueOf(factor * k), 1));
    }
    mProd = prod;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A075511() {
    this(0, 6, 2);
  }

  @Override
  public Z next() {
    return RING.coeff(RING.one(), mProd, ++mN);
  }
}
