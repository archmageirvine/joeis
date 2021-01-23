package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A014700 Poincar\u00e9 series [or Poincare series] (or Molien series) for mod 2 cohomology of universal W-group W(5).
 * @author Sean A. Irvine
 */
public class A014700 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A014700() {
    super(Polynomial.create(1, 5, 40, 176, 440, 835, 1423, 1980, 1980, 1423, 835, 440, 176, 40, 5, 1),
      RING.pow(RING.oneMinusXToTheN(2), 15));
  }
}
