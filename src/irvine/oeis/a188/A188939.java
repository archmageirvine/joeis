package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.SEVEN.add(CR.valueOf(33).sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A188939 Decimal expansion of (7+sqrt(33))/4.
 * @author Georg Fischer
 */
public class A188939 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188939() {
    super(CR.SEVEN.add(CR.valueOf(33).sqrt()).divide(CR.FOUR));
  }
}
