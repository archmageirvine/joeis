package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A002579 Number of integral points in a certain sequence of closed quadrilaterals.
 * @author Sean A. Irvine
 */
public class A002579 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A002579() {
    super(Polynomial.create(1, 1, 0, 1, 1, 1), RING.multiply(RING.pow(Polynomial.create(1, -1), 2), RING.oneMinusXToTheN(6)));
    next();
  }
}

