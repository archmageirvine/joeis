package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153109.
 * @author Sean A. Irvine
 */
public class A153109 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
