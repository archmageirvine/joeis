package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.valueOf(29).sqrt()).divide(CR.FIVE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A188730 Decimal expansion of (2+sqrt(29))/5.
 * @author Georg Fischer
 */
public class A188730 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188730() {
    super(CR.TWO.add(CR.valueOf(29).sqrt()).divide(CR.FIVE));
  }
}
