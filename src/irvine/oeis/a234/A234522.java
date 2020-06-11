package irvine.oeis.a234;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.SEVEN, CR.ONE.divide(CR.FOUR)).subtract(REALS.pow(CR.FIVE, CR.ONE.divide(CR.FOUR))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A234522 Decimal expansion of <code>7^(1/4) - 5^(1/4)</code>.
 * @author Georg Fischer
 */
public class A234522 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.SEVEN, CR.ONE.divide(CR.FOUR)).subtract(REALS.pow(CR.FIVE, CR.ONE.divide(CR.FOUR)));

  @Override
  protected CR getCR() {
    return N;
  }
}
