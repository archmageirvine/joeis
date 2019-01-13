package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154974.
 * @author Sean A. Irvine
 */
public class A154974 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
