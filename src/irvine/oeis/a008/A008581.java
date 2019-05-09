package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A008581 Molien series for 6-dimensional complex reflection group <code>4.U_4 (3)</code> of order <code>2^9 .3^7 .5.7</code>.
 * @author Sean A. Irvine
 */
public class A008581 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A008581() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(1),
      RING.oneMinusXToTheN(2)),
      RING.oneMinusXToTheN(3)),
      RING.oneMinusXToTheN(4)),
      RING.oneMinusXToTheN(5)),
      RING.oneMinusXToTheN(7)));
  }
}
