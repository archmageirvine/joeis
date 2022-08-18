package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019786 Decimal expansion of sqrt(e)/13.
 * @author Sean A. Irvine
 */
public class A019786 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019786() {
    super(0, CR.E.sqrt().divide(CR.valueOf(13)));
  }
}
