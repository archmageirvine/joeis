package irvine.oeis.a294;
// Generated by gen_seq4.pl decexp at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A294670 Decimal expansion of the sum sqrt(2) + sqrt(5).
 * Formula: sqrt(5)+root(4, 4)
 * @author Georg Fischer
 */
public class A294670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A294670() {
    super(1, CR.FIVE.sqrt().add(CR.FOUR.pow(CR.FOUR.inverse())));
  }
}
