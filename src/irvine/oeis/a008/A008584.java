package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A008584 Molien series for Weyl group E_6.
 * @author Sean A. Irvine
 */
public class A008584 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008584() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(2),
      RING.oneMinusXToTheN(5)),
      RING.oneMinusXToTheN(6)),
      RING.oneMinusXToTheN(8)),
      RING.oneMinusXToTheN(9)),
      RING.oneMinusXToTheN(12)));
  }
}

