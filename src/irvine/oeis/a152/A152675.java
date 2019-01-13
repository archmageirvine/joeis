package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152675.
 * @author Sean A. Irvine
 */
public class A152675 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
