package irvine.oeis.a152;
// Generated by gen_seq4.pl dexcr CR.TWO.subtract(REALS.pow(CR.PI, CR.TWO).divide(CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152416 Decimal expansion of <code>2 - Pi^2/6</code>.
 * @author Georg Fischer
 */
public class A152416 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.TWO.subtract(REALS.pow(CR.PI, CR.TWO).divide(CR.SIX));

  @Override
  protected CR getCR() {
    return N;
  }
}
