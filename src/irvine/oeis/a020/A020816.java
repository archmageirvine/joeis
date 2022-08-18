package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020816 Decimal expansion of 1/sqrt(59).
 * @author Sean A. Irvine
 */
public class A020816 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020816() {
    super(0, CR.valueOf(59).sqrt().inverse());
  }
}
