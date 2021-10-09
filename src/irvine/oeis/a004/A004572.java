package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004572 Expansion of sqrt(7) in base 5.
 * @author Sean A. Irvine
 */
public class A004572 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004572() {
    super(0, CR.SEVEN.sqrt(), 5);
  }
}
