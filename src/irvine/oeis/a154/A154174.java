package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154174.
 * @author Sean A. Irvine
 */
public class A154174 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
