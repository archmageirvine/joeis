package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153097 Decimal expansion of log_21 <code>(3)</code>.
 * @author Sean A. Irvine
 */
public class A153097 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
