package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019784 Decimal expansion of sqrt(e)/11.
 * @author Sean A. Irvine
 */
public class A019784 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019784() {
    super(CR.E.sqrt().divide(CR.valueOf(11)));
  }
}
