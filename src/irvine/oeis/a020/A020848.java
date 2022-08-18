package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020848 Decimal expansion of 1/sqrt(91).
 * @author Sean A. Irvine
 */
public class A020848 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020848() {
    super(0, CR.valueOf(91).sqrt().inverse());
  }
}
