package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019761 Decimal expansion of e/24.
 * @author Sean A. Irvine
 */
public class A019761 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019761() {
    super(CR.E.divide(CR.valueOf(24)));
  }
}
