package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019790 Decimal expansion of sqrt(e)/17.
 * @author Sean A. Irvine
 */
public class A019790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019790() {
    super(-1, CR.E.sqrt().divide(CR.valueOf(17)));
  }
}
