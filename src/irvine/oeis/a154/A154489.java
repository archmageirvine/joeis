package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154489.
 * @author Sean A. Irvine
 */
public class A154489 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
