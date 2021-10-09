package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019760 Decimal expansion of e/23.
 * @author Sean A. Irvine
 */
public class A019760 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019760() {
    super(CR.E.divide(CR.valueOf(23)));
  }
}
