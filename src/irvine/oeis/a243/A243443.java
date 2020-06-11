package irvine.oeis.a243;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A243443 Decimal expansion of <code>7^(1/sqrt(7))</code>.
 * @author Georg Fischer
 */
public class A243443 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN.sqrt()));

  @Override
  protected CR getCR() {
    return N;
  }
}
