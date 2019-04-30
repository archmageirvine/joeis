package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195793 Decimal expansion of <code>arctan(1000000)</code>.
 * @author Sean A. Irvine
 */
public class A195793 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.atan(CR.valueOf(1000000));

  @Override
  protected CR getCR() {
    return N;
  }
}
