package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153203.
 * @author Sean A. Irvine
 */
public class A153203 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
