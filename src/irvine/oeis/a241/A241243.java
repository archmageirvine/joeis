package irvine.oeis.a241;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.valueOf(17)).sin() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A241243 Decimal representation of sin(Pi/17).
 * @author Georg Fischer
 */
public class A241243 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A241243() {
    super(CR.PI.divide(CR.valueOf(17)).sin());
  }
}
