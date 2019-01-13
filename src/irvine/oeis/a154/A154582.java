package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154582.
 * @author Sean A. Irvine
 */
public class A154582 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
