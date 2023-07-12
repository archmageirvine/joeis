package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001482 Expansion of (Product_{j&gt;=1} (1-(-x)^j) - 1)^4 in powers of x.
 * @author Sean A. Irvine
 */
public class A001482 extends AbstractSequence {

  private int mN;
  private final int mPower;
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A001482() {
    this(4, 4);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param power power of (-x)
   */
  public A001482(final int offset, final int power) {
    super(offset);
    mPower = power;
    mN = power - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN + 2; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), mN);
    }
    final Z t = RING.pow(RING.subtract(p, RING.one()), mPower, mN).coeff(mN);
    return (mN & 1) == 0 ? t : t.negate();
  }
}
