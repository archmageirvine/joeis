package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140249 Decimal expansion of 3*sqrt(15)/2.
 * @author Sean A. Irvine
 */
public class A140249 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A140249() {
    super(CR.valueOf(135).sqrt().divide(CR.TWO));
  }
}
