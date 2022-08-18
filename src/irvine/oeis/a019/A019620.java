package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019620 Decimal expansion of Pi*e/12.
 * @author Sean A. Irvine
 */
public class A019620 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019620() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(12)));
  }
}
