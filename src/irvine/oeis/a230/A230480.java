package irvine.oeis.a230;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).add(CR.SIX.multiply(CR.PI)).add(CR.ONE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A230480 Decimal expansion of <code>Pi^2+6*Pi+1</code>.
 * @author Georg Fischer
 */
public class A230480 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.TWO).add(CR.SIX.multiply(CR.PI)).add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
