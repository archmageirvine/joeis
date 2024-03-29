package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195361 Decimal expansion of shortest length, (C), of segment from side CA through incenter to side CB in right triangle ABC with sidelengths (a,b,c)=(2,5,sqrt(29)).
 * Formula: 20/(7+29^(1/2))*2^(1/2)
 * @author Georg Fischer
 */
public class A195361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195361() {
    super(1, CR.valueOf(20).divide(CR.SEVEN.add(CR.valueOf(29).sqrt())).multiply(CR.TWO.sqrt()));
  }
}
