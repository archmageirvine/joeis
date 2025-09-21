package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388754 Decimal expansion of (1/4) * exp(Pi / 2) * (2-sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388754 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388754() {
    super(0, CR.HALF_PI.exp().divide(4).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
