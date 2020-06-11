package irvine.oeis.a250;
// Generated by gen_seq4.pl dexcr CR.ONE.add(REALS.pow(CR.TWO, CR.HALF)).add(REALS.pow(CR.THREE, CR.ONE_THIRD)).add(REALS.pow(CR.FOUR, CR.ONE.divide(CR.FOUR))).add(REALS.pow(CR.FIVE, CR.ONE.divide(CR.FIVE))).add(REALS.pow(CR.SIX, CR.ONE.divide(CR.SIX))).add(REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A250091 Decimal expansion of <code>1+2^(1/2)+3^(1/3)+4^(1/4)+5^(1/5)+6^(1/6)+7^(1/7)</code>.
 * @author Georg Fischer
 */
public class A250091 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.ONE.add(REALS.pow(CR.TWO, CR.HALF)).add(REALS.pow(CR.THREE, CR.ONE_THIRD)).add(REALS.pow(CR.FOUR, CR.ONE.divide(CR.FOUR))).add(REALS.pow(CR.FIVE, CR.ONE.divide(CR.FIVE))).add(REALS.pow(CR.SIX, CR.ONE.divide(CR.SIX))).add(REALS.pow(CR.SEVEN, CR.ONE.divide(CR.SEVEN)));

  @Override
  protected CR getCR() {
    return N;
  }
}
