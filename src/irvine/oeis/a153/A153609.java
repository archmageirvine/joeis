package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153609.
 * @author Sean A. Irvine
 */
public class A153609 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
