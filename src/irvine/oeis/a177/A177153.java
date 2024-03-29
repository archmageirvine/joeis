package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.valueOf(21).add(CR.FIVE.multiply(CR.valueOf(26).sqrt())).divide(CR.valueOf(19)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177153 Decimal expansion of (21+5*sqrt(26))/19.
 * @author Georg Fischer
 */
public class A177153 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177153() {
    super(CR.valueOf(21).add(CR.FIVE.multiply(CR.valueOf(26).sqrt())).divide(CR.valueOf(19)));
  }
}
