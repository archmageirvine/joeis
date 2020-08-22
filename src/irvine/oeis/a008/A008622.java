package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A008622 Expansion of 1/((1-x^4)*(1-x^6)*(1-x^7)).
 * @author Sean A. Irvine
 */
public class A008622 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008622() {
    super(RING.one(), RING.multiply(RING.multiply(RING.oneMinusXToTheN(4), RING.oneMinusXToTheN(6)), RING.oneMinusXToTheN(7)));
  }
}
