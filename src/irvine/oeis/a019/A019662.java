package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019662 Decimal expansion of sqrt(Pi*e)/18.
 * @author Sean A. Irvine
 */
public class A019662 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019662() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(18)));
  }
}
