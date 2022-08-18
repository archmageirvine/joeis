package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004576 Expansion of sqrt(7) in base 9.
 * @author Sean A. Irvine
 */
public class A004576 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004576() {
    super(1, CR.SEVEN.sqrt(), 9);
  }
}
