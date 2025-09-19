package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388097 Decimal expansion of (1/8) * exp(1/2 * Pi) * 2^(1/2).
 * @author Sean A. Irvine
 */
public class A388097 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388097() {
    super(0, CR.HALF_PI.exp().divide(8).multiply(CR.SQRT2));
  }
}
