package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005403.
 * @author Sean A. Irvine
 */
public class A005403 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, -1);
  private final Polynomial<Z> mNum;
  private final Polynomial<Z> mDen;
  private int mN = 0;

  protected A005403(final int degree) {
    mNum = RING.pow(X1, degree);
    Polynomial<Z> d = RING.one();
    for (int k = 1; k <= degree; ++k) {
      d = RING.multiply(d, RING.add(RING.subtract(X1, RING.monomial(Z.ONE, k)), RING.monomial(Z.ONE, 1 + 2 * k)));
    }
    mDen = d;
  }

  /** Construct the sequence. */
  public A005403() {
    this(2);
  }

  @Override
  public Z next() {
    return RING.coeff(mNum, mDen, ++mN);
  }
}
