package irvine.oeis.a237;
// Generated by gen_seq4.pl dex CR.PI.subtract(CR.PHI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A237200 Decimal expansion of Pi - phi.
 * @author Georg Fischer
 */
public class A237200 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A237200() {
    super(CR.PI.subtract(CR.PHI));
  }
}
