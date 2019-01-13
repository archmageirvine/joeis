package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153607.
 * @author Sean A. Irvine
 */
public class A153607 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
