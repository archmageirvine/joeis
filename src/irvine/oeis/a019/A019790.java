package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019790 Decimal expansion of sqrt(e)/17.
 * @author Sean A. Irvine
 */
public class A019790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019790() {
    super(0, CR.E.sqrt().divide(CR.valueOf(17)));
  }
}
