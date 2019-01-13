package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179290.
 * @author Sean A. Irvine
 */
public class A179290 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(50).subtract(CR.valueOf(500).sqrt()).sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
