package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019734 Decimal expansion of sqrt(2*Pi)/15.
 * @author Sean A. Irvine
 */
public class A019734 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019734() {
    super(CR.TAU.sqrt().divide(CR.valueOf(15)));
  }
}
