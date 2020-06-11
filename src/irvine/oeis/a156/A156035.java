package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156035 Decimal expansion of <code>3 + 2*sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A156035 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.EIGHT.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
