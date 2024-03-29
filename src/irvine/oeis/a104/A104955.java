package irvine.oeis.a104;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104955 Decimal expansion of the area of the regular 5-gon (pentagon) of circumradius = 1.
 * Formula: (5*sqrt((5+sqrt(5))/2))/4
 * @author Georg Fischer
 */
public class A104955 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104955() {
    super(1, CR.FIVE.multiply(CR.FIVE.add(CR.FIVE.sqrt()).divide(CR.TWO).sqrt()).divide(CR.FOUR));
  }
}
