package irvine.oeis.a157;
// manually 2021-09-27

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a088.A088855;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A157052 Number of integer sequences of length n+1 with sum zero and sum of absolute values 6.
 * @author Georg Fischer
 */
public class A157052 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A157052() {
    this(1, 6);
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param parm parameter "of absolute value"
   */
  public A157052(final int offset, final int parm) {
    setOffset(offset);
    final Polynomial<Z> den = RING.pow(RING.oneMinusXToTheN(1), parm + 1);
    Polynomial<Z> num = RING.zero();
    for (int i = 1; i <= parm - 1; ++i) {
      num = RING.add(num, RING.monomial(A088855.element(parm - 1, i), i));
    }
    num = RING.multiply(num, RING.monomial(Z.TWO, 1)); // *2*x
    mNum = new Z[num.degree() + 1];
    mDen = new Z[den.degree() + 1];
    for (int i = 0; i < mNum.length; ++i) {
      mNum[i] = num.coeff(i);
    }
    for (int i = 0; i < mDen.length; ++i) {
      mDen[i] = den.coeff(i);
    }
    next();
    next();
  }
}
