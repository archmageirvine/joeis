package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073233 Decimal expansion of <code>Pi^Pi</code>.
 * @author Sean A. Irvine
 */
public class A073233 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
