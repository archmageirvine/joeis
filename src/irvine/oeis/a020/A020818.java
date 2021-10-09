package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020818 Decimal expansion of 1/sqrt(61).
 * @author Sean A. Irvine
 */
public class A020818 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020818() {
    super(CR.valueOf(61).sqrt().inverse());
  }
}
