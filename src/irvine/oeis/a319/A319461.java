package irvine.oeis.a319;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.EIGHT).subtract(CR.THREE.divide(CR.EIGHT).multiply(REALS.pow(CR.TWO.log(), CR.TWO))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A319461 Decimal expansion of <code>Pi^2/8 - (3/8)*log(2)^2</code>.
 * @author Georg Fischer
 */
public class A319461 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.TWO).divide(CR.EIGHT).subtract(CR.THREE.divide(CR.EIGHT).multiply(REALS.pow(CR.TWO.log(), CR.TWO)));

  @Override
  protected CR getCR() {
    return N;
  }
}
