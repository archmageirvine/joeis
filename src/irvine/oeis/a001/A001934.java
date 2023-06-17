package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001934 Expansion of 1/theta_4(q)^2 in powers of q.
 * @author Sean A. Irvine
 */
public class A001934 extends AbstractSequence {

  /** Construct the sequence. */
  public A001934() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mNum = RING.one();
  private Polynomial<Z> mDen = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mNum = RING.multiply(mNum, RING.pow(RING.onePlusXToTheN(mN), 2));
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(mN), 2));
    }
    return RING.coeff(mNum, mDen, mN);
  }
}

