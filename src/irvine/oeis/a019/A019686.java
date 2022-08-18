package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019686 Decimal expansion of Pi/19.
 * @author Sean A. Irvine
 */
public class A019686 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019686() {
    super(0, CR.PI.divide(CR.valueOf(19)));
  }
}
