package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019756 Decimal expansion of e/19.
 * @author Sean A. Irvine
 */
public class A019756 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019756() {
    super(CR.E.divide(CR.valueOf(19)));
  }
}
