package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007525 Decimal expansion of log_2 e.
 * @author Sean A. Irvine
 */
public class A007525 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
