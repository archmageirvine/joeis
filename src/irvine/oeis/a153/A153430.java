package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153430.
 * @author Sean A. Irvine
 */
public class A153430 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
