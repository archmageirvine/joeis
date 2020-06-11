package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E.divide(CR.PI), CR.EIGHT) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094119 Decimal expansion of <code>(e/Pi)^8</code>.
 * @author Georg Fischer
 */
public class A094119 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E.divide(CR.PI), CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
