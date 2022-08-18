package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019703 Decimal expansion of 2*Pi/23.
 * @author Sean A. Irvine
 */
public class A019703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019703() {
    super(0, CR.TAU.divide(CR.valueOf(23)));
  }
}
