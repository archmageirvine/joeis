package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020858.
 * @author Sean A. Irvine
 */
public class A020858 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
