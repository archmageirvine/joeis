package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388578 Decimal expansion of (1/8) * exp(Pi / 2).
 * @author Sean A. Irvine
 */
public class A388578 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388578() {
    super(0, CR.HALF_PI.exp().divide(8));
  }
}
