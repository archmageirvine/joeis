package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019676 Decimal expansion of Pi/9.
 * @author Sean A. Irvine
 */
public class A019676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019676() {
    super(CR.PI.divide(CR.NINE));
  }
}
