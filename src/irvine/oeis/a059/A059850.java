package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A059850 Decimal expansion of Pi^e.
 * @author Sean A. Irvine
 */
public class A059850 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
