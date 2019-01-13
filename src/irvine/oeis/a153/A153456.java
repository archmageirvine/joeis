package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153456.
 * @author Sean A. Irvine
 */
public class A153456 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
