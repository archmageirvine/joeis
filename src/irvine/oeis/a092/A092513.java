package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.SEVEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A092513 Decimal expansion of <code>e^7</code>.
 * @author Georg Fischer
 */
public class A092513 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E, CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
