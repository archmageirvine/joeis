package irvine.oeis.a275;
// Generated by gen_seq4.pl dexcr CR.NINE.multiply(Zeta.zeta(3)).divide(REALS.pow(CR.PI, CR.TWO).multiply(CR.TWO.log())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A275688 Decimal expansion of <code>9*zeta(3)/(Pi^2*log(2))</code>.
 * @author Georg Fischer
 */
public class A275688 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.NINE.multiply(Zeta.zeta(3)).divide(REALS.pow(CR.PI, CR.TWO).multiply(CR.TWO.log()));

  @Override
  protected CR getCR() {
    return N;
  }
}
