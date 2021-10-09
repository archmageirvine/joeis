package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019759 Decimal expansion of e/22.
 * @author Sean A. Irvine
 */
public class A019759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019759() {
    super(CR.E.divide(CR.valueOf(22)));
  }
}
