package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019731 Decimal expansion of sqrt(2*Pi)/9.
 * @author Sean A. Irvine
 */
public class A019731 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019731() {
    super(0, CR.TAU.sqrt().divide(CR.NINE));
  }
}
