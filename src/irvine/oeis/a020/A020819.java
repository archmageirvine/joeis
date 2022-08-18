package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020819 Decimal expansion of 1/sqrt(62).
 * @author Sean A. Irvine
 */
public class A020819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020819() {
    super(0, CR.valueOf(62).sqrt().inverse());
  }
}
