package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A008621 Expansion of 1/((1-x)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A008621 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008621() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(1), RING.oneMinusXToTheN(4)));
  }
}
