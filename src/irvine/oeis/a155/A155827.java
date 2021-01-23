package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155827 Decimal expansion of log_8 (23).
 * @author Sean A. Irvine
 */
public class A155827 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
