package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.NINE.add(CR.valueOf(85).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176522 Decimal expansion of (9+sqrt(85))/2.
 * @author Georg Fischer
 */
public class A176522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176522() {
    super(CR.NINE.add(CR.valueOf(85).sqrt()).divide(CR.TWO));
  }
}
