package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152748.
 * @author Sean A. Irvine
 */
public class A152748 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
