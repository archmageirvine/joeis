package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388516 Decimal expansion of 2 * exp(-Pi / 4) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388516 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388516() {
    super(1, CR.PI.divide(-4).exp().multiply(2).multiply(CR.SQRT2));
  }
}
