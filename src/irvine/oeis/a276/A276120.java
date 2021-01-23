package irvine.oeis.a276;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A276120 Decimal expansion of Zeta(3)/Pi^3.
 * @author Sean A. Irvine
 */
public class A276120 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(3).divide(CR.PI.multiply(CR.PI).multiply(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
