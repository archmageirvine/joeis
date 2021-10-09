package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019782 Decimal expansion of sqrt(e)/9.
 * @author Sean A. Irvine
 */
public class A019782 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019782() {
    super(CR.E.sqrt().divide(CR.NINE));
  }
}
