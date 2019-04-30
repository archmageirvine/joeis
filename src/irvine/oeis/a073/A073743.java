package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073743 Decimal expansion of <code>cosh(1)</code>.
 * @author Sean A. Irvine
 */
public class A073743 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.cosh(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
