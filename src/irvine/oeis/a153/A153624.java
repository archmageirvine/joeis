package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153624.
 * @author Sean A. Irvine
 */
public class A153624 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
