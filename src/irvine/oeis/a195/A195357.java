package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195357 Decimal expansion of shortest length, (C), of segment from side CA through incenter to side CB in right triangle ABC with sidelengths (a,b,c)=(2,3,sqrt(13)).
 * Formula: 12/(5+13^(1/2))*2^(1/2)
 * @author Georg Fischer
 */
public class A195357 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195357() {
    super(1, CR.valueOf(12).divide(CR.FIVE.add(CR.valueOf(13).sqrt())).multiply(CR.TWO.sqrt()));
  }
}
