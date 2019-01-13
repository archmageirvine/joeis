package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153617.
 * @author Sean A. Irvine
 */
public class A153617 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
