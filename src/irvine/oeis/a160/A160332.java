package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160332 Decimal expansion of the one real root of x^3-8x-10.
 * @author Sean A. Irvine
 */
public class A160332 extends DecimalExpansionSequence {

  private static final CR THIRD = CR.THREE.inverse();
  private static final CR SQRT = CR.valueOf(163).divide(CR.valueOf(27)).sqrt();
  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE.add(SQRT), THIRD)
    .add(ComputableReals.SINGLETON.pow(CR.FIVE.subtract(SQRT), THIRD));

  @Override
  protected CR getCR() {
    return N;
  }
}
