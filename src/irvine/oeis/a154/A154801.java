package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154801.
 * @author Sean A. Irvine
 */
public class A154801 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
