package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154911.
 * @author Sean A. Irvine
 */
public class A154911 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
