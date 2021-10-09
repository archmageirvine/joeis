package irvine.oeis.a139;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A139339 Decimal expansion of the square root of the golden ratio.
 * @author Sean A. Irvine
 */
public class A139339 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A139339() {
    super(CR.PHI.sqrt());
  }
}
