package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195388 Decimal expansion of shortest length, (C), of segment from side CA through incenter to side CB in right triangle ABC with sidelengths (a,b,c)=(sqrt(2),sqrt(5),sqrt(7)).
 * Formula: 4*5^(1/2)/(2^(1/2)+5^(1/2)+7^(1/2))
 * @author Georg Fischer
 */
public class A195388 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195388() {
    super(1, CR.FOUR.multiply(CR.FIVE.sqrt()).divide(CR.TWO.sqrt().add(CR.FIVE.sqrt()).add(CR.SEVEN.sqrt())));
  }
}
