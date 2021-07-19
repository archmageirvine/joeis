package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019695 Decimal expansion of 2*Pi/7.
 * @author Sean A. Irvine
 */
public class A019695 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019695() {
    super(CR.TAU.divide(CR.SEVEN));
  }
}
