package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020852 Decimal expansion of 1/sqrt(95).
 * @author Sean A. Irvine
 */
public class A020852 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020852() {
    super(0, CR.valueOf(95).sqrt().inverse());
  }
}
