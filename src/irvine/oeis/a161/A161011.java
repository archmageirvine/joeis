package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A161011 Decimal expansion of tan(1/2).
 * @author Sean A. Irvine
 */
public class A161011 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.tan(CR.HALF);

  @Override
  protected CR getCR() {
    return N;
  }
}
