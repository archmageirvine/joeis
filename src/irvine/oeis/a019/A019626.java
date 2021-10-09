package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019626 Decimal expansion of Pi*e/18.
 * @author Sean A. Irvine
 */
public class A019626 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019626() {
    super(CR.PI.multiply(CR.E).divide(CR.valueOf(18)));
  }
}
