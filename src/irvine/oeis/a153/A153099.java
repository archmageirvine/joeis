package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153099 Decimal expansion of log_23 (3).
 * @author Sean A. Irvine
 */
public class A153099 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
