package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A005822 G.f.: x*(1-x^2)*(x^4+x^3-x^2+x+1) / (x^8-4*x^6-x^4-4*x^2+1).
 * @author Sean A. Irvine
 */
public class A005822 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A005822() {
    super(RING.multiply(Polynomial.create(1, 1, -1, 1, 1), RING.oneMinusXToTheN(2)).shift(1),
      Polynomial.create(1, 0, -4, 0, -1, 0, -4, 0, 1));
  }
}
