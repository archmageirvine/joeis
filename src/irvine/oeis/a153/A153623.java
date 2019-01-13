package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153623.
 * @author Sean A. Irvine
 */
public class A153623 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
