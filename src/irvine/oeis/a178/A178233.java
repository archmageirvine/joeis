package irvine.oeis.a178;
// Generated by gen_seq4.pl dex CR.valueOf(11).add(CR.valueOf(229).sqrt()).divide(CR.valueOf(18)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A178233 Decimal expansion of (11+sqrt(229))/18.
 * @author Georg Fischer
 */
public class A178233 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A178233() {
    super(CR.valueOf(11).add(CR.valueOf(229).sqrt()).divide(CR.valueOf(18)));
  }
}
