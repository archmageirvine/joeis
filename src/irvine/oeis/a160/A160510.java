package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.FOUR).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160510 Decimal expansion of exp(Pi/4).
 * @author Georg Fischer
 */
public class A160510 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160510() {
    super(CR.PI.divide(CR.FOUR).exp());
  }
}
