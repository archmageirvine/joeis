package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153610.
 * @author Sean A. Irvine
 */
public class A153610 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
