package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004558 Expansion of sqrt(5) in base 5.
 * @author Sean A. Irvine
 */
public class A004558 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004558() {
    super(0, CR.FIVE.sqrt(), 5);
  }
}
