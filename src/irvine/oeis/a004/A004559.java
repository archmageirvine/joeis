package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004559 Expansion of sqrt(5) in base 2.
 * @author Sean A. Irvine
 */
public class A004559 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004559() {
    super(0, CR.FIVE.sqrt(), 6);
  }
}
