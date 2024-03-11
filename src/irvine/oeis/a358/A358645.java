package irvine.oeis.a358;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A358645 Decimal expansion of 4/5 + log(5).
 * @author Georg Fischer
 */
public class A358645 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A358645() {
    super(CR.FOUR.divide(CR.FIVE).add(CR.FIVE.log()));
  }
}
