package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153306.
 * @author Sean A. Irvine
 */
public class A153306 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
