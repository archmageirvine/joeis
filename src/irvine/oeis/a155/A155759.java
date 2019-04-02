package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155759 Decimal expansion of log_13 (22).
 * @author Sean A. Irvine
 */
public class A155759 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
