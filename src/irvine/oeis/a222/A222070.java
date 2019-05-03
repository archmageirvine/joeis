package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222070 Decimal expansion of <code>(1/144)*3^(1/2)*Pi^3</code>.
 * @author Sean A. Irvine
 */
public class A222070 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).multiply(CR.PI).multiply(CR.THREE.sqrt()).divide(CR.valueOf(144));

  @Override
  protected CR getCR() {
    return N;
  }
}
