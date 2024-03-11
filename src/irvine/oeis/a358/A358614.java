package irvine.oeis.a358;
// manually 2024-03-08

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A358614 Decimal expansion of 9*sqrt(2)/32.
 * @author Georg Fischer
 */
public class A358614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A358614() {
    super(0, CR.NINE.multiply(CR.TWO.sqrt()).divide(CR.valueOf(32)));
  }
}
