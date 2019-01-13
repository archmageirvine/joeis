package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154900.
 * @author Sean A. Irvine
 */
public class A154900 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
