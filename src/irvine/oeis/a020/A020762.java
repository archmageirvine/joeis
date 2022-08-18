package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020762 Decimal expansion of 1/sqrt(5).
 * @author Sean A. Irvine
 */
public class A020762 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020762() {
    super(0, CR.FIVE.sqrt().inverse());
  }
}
