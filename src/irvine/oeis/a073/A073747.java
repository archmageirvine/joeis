package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073747.
 * @author Sean A. Irvine
 */
public class A073747 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.coth(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
