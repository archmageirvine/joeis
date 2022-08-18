package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020776 Decimal expansion of 1/sqrt(19).
 * @author Sean A. Irvine
 */
public class A020776 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020776() {
    super(0, CR.valueOf(19).sqrt().inverse());
  }
}
