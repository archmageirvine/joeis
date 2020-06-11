package irvine.oeis.a185;
// Generated by gen_seq4.pl dexcr CR.TAU.divide(CR.SEVEN.multiply(Zeta.zeta(3))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A185196 Decimal expansion of <code>2*Pi/(7*Zeta(3))</code>.
 * @author Georg Fischer
 */
public class A185196 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.TAU.divide(CR.SEVEN.multiply(Zeta.zeta(3)));

  @Override
  protected CR getCR() {
    return N;
  }
}
