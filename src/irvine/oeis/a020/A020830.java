package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020830 Decimal expansion of 1/sqrt(73).
 * @author Sean A. Irvine
 */
public class A020830 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020830() {
    super(0, CR.valueOf(73).sqrt().inverse());
  }
}
