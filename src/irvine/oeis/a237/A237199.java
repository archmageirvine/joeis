package irvine.oeis.a237;
// Generated by gen_seq4.pl dex CR.E.subtract(CR.PHI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A237199 Decimal expansion of e - phi.
 * @author Georg Fischer
 */
public class A237199 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A237199() {
    super(CR.E.subtract(CR.PHI));
  }
}
