package irvine.oeis.a258;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A258403 Decimal expansion of the area of the regular 10-gon (decagon) of circumradius = 1.
 * @author Georg Fischer
 */
public class A258403 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A258403() {
    super(1, CR.FIVE.divide(CR.TWO).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).divide(CR.TWO).sqrt()));
  }
}
