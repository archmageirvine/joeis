package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388819 Decimal expansion of -(1/2) * exp(Pi / 2) * (sqrt(2)-2).
 * @author Sean A. Irvine
 */
public class A388819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388819() {
    super(1, CR.HALF_PI.exp().divide(-2).multiply(CR.SQRT2.subtract(2)));
  }
}
