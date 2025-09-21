package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388780 Decimal expansion of (1/32) * exp(-Pi) * (5-5^(1/2))^2 * (5^(1/2)+1)^4.
 * @author Sean A. Irvine
 */
public class A388780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388780() {
    super(1, CR.PI.negate().exp().divide(32).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().add(1).pow(4)));
  }
}
