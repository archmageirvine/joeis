package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388776 Decimal expansion of (11+5 * sqrt(5)) * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388776 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388776() {
    super(0, CR.PI.negate().exp().divide(2000).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(5)).multiply(CR.FIVE.sqrt()));
  }
}
