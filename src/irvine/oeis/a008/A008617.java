package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A008617 Expansion of 1/((1-x^2)(1-x^7)).
 * @author Sean A. Irvine
 */
public class A008617 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008617() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(7)));
  }
}
