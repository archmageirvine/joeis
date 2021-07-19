package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019698 Decimal expansion of 2*Pi/13.
 * @author Sean A. Irvine
 */
public class A019698 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019698() {
    super(CR.TAU.divide(CR.valueOf(13)));
  }
}
