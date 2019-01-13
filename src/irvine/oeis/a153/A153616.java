package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153616.
 * @author Sean A. Irvine
 */
public class A153616 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
