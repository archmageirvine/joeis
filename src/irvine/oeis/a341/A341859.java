package irvine.oeis.a341;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A341859 Decimal expansion of 4 - (8/5)*sqrt(5).
 * @author Georg Fischer
 */
public class A341859 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A341859() {
    super(0, CR.FOUR.subtract(CR.EIGHT.divide(CR.FIVE).multiply(CR.FIVE.sqrt())));
  }
}
