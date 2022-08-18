package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019676 Decimal expansion of Pi/9.
 * @author Sean A. Irvine
 */
public class A019676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019676() {
    super(0, CR.PI.divide(CR.NINE));
  }
}
