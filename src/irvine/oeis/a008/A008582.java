package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A008582 Molien series for Weyl group <code>E_8</code>.
 * @author Sean A. Irvine
 */
public class A008582 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008582() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(1),
      RING.oneMinusXToTheN(4)),
      RING.oneMinusXToTheN(6)),
      RING.oneMinusXToTheN(7)),
      RING.oneMinusXToTheN(9)),
      RING.oneMinusXToTheN(10)),
      RING.oneMinusXToTheN(12)),
      RING.oneMinusXToTheN(15)));
  }
}

