package irvine.oeis.a243;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A243443 Decimal expansion of 7^(1/sqrt(7)).
 * @author Georg Fischer
 */
public class A243443 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A243443() {
    super(REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN.sqrt())));
  }
}
