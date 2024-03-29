package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195288 Decimal expansion of shortest length, (C), of segment from side CA through incenter to side CB in right triangle ABC with sidelengths (a,b,c)=(5,12,13).
 * Formula: 4/3*13^(1/2)
 * @author Georg Fischer
 */
public class A195288 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195288() {
    super(1, CR.FOUR.divide(CR.THREE).multiply(CR.valueOf(13).sqrt()));
  }
}
