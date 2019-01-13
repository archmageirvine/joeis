package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153107.
 * @author Sean A. Irvine
 */
public class A153107 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
