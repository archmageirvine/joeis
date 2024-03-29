package irvine.oeis.a329;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329212 Decimal expansion of the fundamental frequency of the note F4 in hertz.
 * Formula: 220*2^(2/3)
 * @author Georg Fischer
 */
public class A329212 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A329212() {
    super(3, CR.valueOf(220).multiply(CR.TWO.pow(CR.TWO.divide(CR.THREE))));
  }
}
