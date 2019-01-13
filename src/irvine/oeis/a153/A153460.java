package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153460.
 * @author Sean A. Irvine
 */
public class A153460 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
