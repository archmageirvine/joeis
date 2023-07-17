package irvine.oeis.a178;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A178666 Irregular triangle read by rows in which row n gives expansion of the polynomial Product_{k=0..n} (1 + x^(2*k + 1)), n &gt;= -1.
 * @author Sean A. Irvine
 */
public class A178666 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A178666(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A178666() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  protected Polynomial<Z> a178666(final int n) {
    Polynomial<Z> prod = RING.one();
    for (int k = 0; k <= n; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(2 * k + 1));
    }
    return prod;
  }

  private int mN = -2;
  private int mM = 0;
  private Polynomial<Z> mRow = RING.zero();

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = a178666(++mN);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
