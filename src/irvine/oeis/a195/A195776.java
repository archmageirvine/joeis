package irvine.oeis.a195;
// Generated by gen_seq4.pl decexpr at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195776 Decimal expansion of arccsc(6).
 * @author Georg Fischer
 */
public class A195776 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A195776() {
    super(0, REALS.asin(CR.ONE.divide(CR.SIX)));
  }
}
