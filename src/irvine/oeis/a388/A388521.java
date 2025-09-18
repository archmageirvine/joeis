package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388521 Decimal expansion of (1/10) * exp(-Pi / 2) * (5+5^(1/2))^2.
 * @author Sean A. Irvine
 */
public class A388521 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388521() {
    super(1, CR.HALF_PI.negate().exp().divide(10).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()));
  }
}
