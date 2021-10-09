package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020811 Decimal expansion of 1/sqrt(54).
 * @author Sean A. Irvine
 */
public class A020811 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020811() {
    super(CR.valueOf(54).sqrt().inverse());
  }
}
