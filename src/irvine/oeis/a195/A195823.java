package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr CR.EIGHT.multiply(CR.PI).multiply(REALS.pow(CR.FIVE, CR.HALF)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195823 Decimal expansion of <code>8*Pi*5^(1/2)</code>.
 * @author Georg Fischer
 */
public class A195823 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.EIGHT.multiply(CR.PI).multiply(REALS.pow(CR.FIVE, CR.HALF));

  @Override
  protected CR getCR() {
    return N;
  }
}
