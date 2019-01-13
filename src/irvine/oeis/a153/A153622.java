package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153622.
 * @author Sean A. Irvine
 */
public class A153622 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
