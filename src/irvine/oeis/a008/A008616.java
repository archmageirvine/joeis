package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A008616 Expansion of <code>1/((1-x^2)(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A008616 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008616() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(5)));
  }
}
