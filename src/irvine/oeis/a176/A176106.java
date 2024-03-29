package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(21).add(CR.FIVE.multiply(CR.valueOf(21).sqrt())).divide(CR.valueOf(14)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176106 Decimal expansion of (21+5*sqrt(21))/14.
 * @author Georg Fischer
 */
public class A176106 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176106() {
    super(CR.valueOf(21).add(CR.FIVE.multiply(CR.valueOf(21).sqrt())).divide(CR.valueOf(14)));
  }
}
