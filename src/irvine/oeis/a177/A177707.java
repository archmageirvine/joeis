package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.FIVE.add(CR.valueOf(65).sqrt()).divide(CR.EIGHT) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177707 Decimal expansion of (5+sqrt(65))/8.
 * @author Georg Fischer
 */
public class A177707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177707() {
    super(CR.FIVE.add(CR.valueOf(65).sqrt()).divide(CR.EIGHT));
  }
}
