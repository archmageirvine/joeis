package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153871.
 * @author Sean A. Irvine
 */
public class A153871 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
