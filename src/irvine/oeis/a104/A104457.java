package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A104457 Decimal expansion of <code>1 +</code> phi = phi^2 <code>= (3 + sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A104457 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.FIVE.sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
