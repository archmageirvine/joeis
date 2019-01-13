package irvine.oeis.a113;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A113211.
 * @author Sean A. Irvine
 */
public class A113211 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
