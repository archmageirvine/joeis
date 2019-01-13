package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154462.
 * @author Sean A. Irvine
 */
public class A154462 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
