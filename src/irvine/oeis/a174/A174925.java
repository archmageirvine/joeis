package irvine.oeis.a174;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.SIX.sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A174925 Decimal expansion of (2+sqrt(6))/4.
 * @author Georg Fischer
 */
public class A174925 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A174925() {
    super(CR.TWO.add(CR.SIX.sqrt()).divide(CR.FOUR));
  }
}
