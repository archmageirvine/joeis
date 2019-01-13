package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153735.
 * @author Sean A. Irvine
 */
public class A153735 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
