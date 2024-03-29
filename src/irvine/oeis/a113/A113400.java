package irvine.oeis.a113;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.E).add(CR.E.divide(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113400 Decimal expansion of Pi/e + e/Pi.
 * @author Georg Fischer
 */
public class A113400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A113400() {
    super(CR.PI.divide(CR.E).add(CR.E.divide(CR.PI)));
  }
}
