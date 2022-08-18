package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019777 Decimal expansion of sqrt(e)/4.
 * @author Sean A. Irvine
 */
public class A019777 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019777() {
    super(0, CR.E.sqrt().divide(CR.FOUR));
  }
}
