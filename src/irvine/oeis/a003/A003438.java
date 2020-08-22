package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A003438 Number of 5 X 5 matrices with nonnegative integer entries and row and column sums equal to n.
 * @author Sean A. Irvine
 */
public class A003438 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A003438() {
    super(Polynomial.create(1, 103, 4306, 63110, 388615, 1115068, 1575669, 1115068, 388615, 63110, 4306, 103, 1),
      RING.pow(RING.oneMinusXToTheN(1), 17));
  }
}

