package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153618 Decimal expansion of log_8 (7).
 * @author Sean A. Irvine
 */
public class A153618 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
