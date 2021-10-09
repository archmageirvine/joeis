package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019621 Decimal expansion of Pi*e/13.
 * @author Sean A. Irvine
 */
public class A019621 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019621() {
    super(CR.PI.multiply(CR.E).divide(CR.valueOf(13)));
  }
}
