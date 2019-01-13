package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154540.
 * @author Sean A. Irvine
 */
public class A154540 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
