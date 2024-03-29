package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140239 Decimal expansion of 3*sqrt(15)/4.
 * @author Sean A. Irvine
 */
public class A140239 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A140239() {
    super(CR.valueOf(135).sqrt().divide(CR.FOUR));
  }
}
