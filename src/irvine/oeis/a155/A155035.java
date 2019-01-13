package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155035.
 * @author Sean A. Irvine
 */
public class A155035 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
