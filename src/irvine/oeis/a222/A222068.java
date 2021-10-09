package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A222068 Decimal expansion of (1/16)*Pi^2.
 * @author Sean A. Irvine
 */
public class A222068 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A222068() {
    super(CR.PI.multiply(CR.PI).divide(CR.valueOf(16)));
  }
}
