package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.valueOf(14).sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177033 Decimal expansion of (2+sqrt(14))/4.
 * @author Georg Fischer
 */
public class A177033 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177033() {
    super(CR.TWO.add(CR.valueOf(14).sqrt()).divide(CR.FOUR));
  }
}
