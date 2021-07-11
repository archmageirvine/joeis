package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004560 Expansion of sqrt(5) in base 2.
 * @author Sean A. Irvine
 */
public class A004560 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004560() {
    super(0, CR.FIVE.sqrt(), 7);
  }
}
