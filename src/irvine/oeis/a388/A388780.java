package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388780 Decimal expansion of 5 * (3+sqrt(5)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388780() {
    super(1, CR.PI.negate().exp().divide(32).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().add(1).pow(4)));
  }
}
