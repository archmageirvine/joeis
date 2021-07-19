package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019701 Decimal expansion of 2*Pi/19.
 * @author Sean A. Irvine
 */
public class A019701 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019701() {
    super(CR.TAU.divide(CR.valueOf(19)));
  }
}
