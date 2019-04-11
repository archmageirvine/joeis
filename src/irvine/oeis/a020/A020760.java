package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020760 Decimal expansion of <code>1/sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A020760 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
