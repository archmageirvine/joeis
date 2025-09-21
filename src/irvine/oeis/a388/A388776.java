package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388776 Decimal expansion of (1/2000) * exp(-Pi) * (5+5^(1/2))^5*5^(1/2).
 * @author Sean A. Irvine
 */
public class A388776 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388776() {
    super(0, CR.PI.negate().exp().divide(2000).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(5)).multiply(CR.FIVE.sqrt()));
  }
}
