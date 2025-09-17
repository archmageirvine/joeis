package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388246 Decimal expansion of (1/2) * exp(1*Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388246 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388246() {
    super(1, CR.PI.divide(6).exp().divide(2).multiply(CR.SQRT2));
  }
}
