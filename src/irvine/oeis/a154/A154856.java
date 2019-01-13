package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154856.
 * @author Sean A. Irvine
 */
public class A154856 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
