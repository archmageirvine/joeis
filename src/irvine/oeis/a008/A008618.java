package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A008618 Expansion of 1/((1-x^2)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A008618 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008618() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(9)));
  }
}
