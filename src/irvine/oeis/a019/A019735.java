package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019735 Decimal expansion of sqrt(2*Pi)/17.
 * @author Sean A. Irvine
 */
public class A019735 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019735() {
    super(0, CR.TAU.sqrt().divide(CR.valueOf(17)));
  }
}
