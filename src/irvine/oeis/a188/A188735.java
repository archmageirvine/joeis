package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.NINE.add(CR.valueOf(97).sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A188735 Decimal expansion of (9+sqrt(97))/4.
 * @author Georg Fischer
 */
public class A188735 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188735() {
    super(CR.NINE.add(CR.valueOf(97).sqrt()).divide(CR.FOUR));
  }
}
