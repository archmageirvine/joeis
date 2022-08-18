package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020764 Decimal expansion of 1/sqrt(7).
 * @author Sean A. Irvine
 */
public class A020764 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020764() {
    super(0, CR.SEVEN.sqrt().inverse());
  }
}
