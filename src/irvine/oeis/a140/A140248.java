package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140248 Decimal expansion of 0.3 * sqrt(15).
 * @author Sean A. Irvine
 */
public class A140248 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A140248() {
    super(CR.valueOf(135).sqrt().divide(CR.TEN));
  }
}
