package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388254 Decimal expansion of (1/4) * exp(Pi / 2) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388254 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388254() {
    super(1, CR.HALF_PI.exp().divide(4).multiply(CR.SQRT2));
  }
}
