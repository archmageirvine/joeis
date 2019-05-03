package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222071 Decimal expansion of <code>(1/105)*Pi^3</code>.
 * @author Sean A. Irvine
 */
public class A222071 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).multiply(CR.PI).divide(CR.valueOf(105));

  @Override
  protected CR getCR() {
    return N;
  }
}
