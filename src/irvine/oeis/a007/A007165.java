package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007165 Number of P-graphs with 2n edges.
 * @author Sean A. Irvine
 */
public class A007165 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007165(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007165() {
    super(1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> TWO = Polynomial.create(2);
  private static final Polynomial<Z> THREE = Polynomial.create(3);
  private Polynomial<Z> mA = Polynomial.create(1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = RING.add(RING.add(RING.one(),
        RING.multiply(mA, RING.subtract(THREE, RING.multiply(mA, Z.TWO)), mN).shift(1)),
        RING.multiply(RING.pow(mA, 2, mN - 2), RING.add(mA, TWO), mN - 2).shift(2));
    }
    return mA.coeff(mN);
  }
}
