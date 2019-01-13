package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153756.
 * @author Sean A. Irvine
 */
public class A153756 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).log().divide(CR.valueOf(9).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
