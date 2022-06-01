package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A006493 Generalized Lucas numbers.
 * @author Sean A. Irvine
 */
public class A006493 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A006493() {
    super(RING.multiply(RING.pow(Polynomial.create(1, -1), 3), Polynomial.create(1, -2, 2)), RING.pow(Polynomial.create(1, -1, -1), 5));
  }
}

