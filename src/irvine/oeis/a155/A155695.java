package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155695.
 * @author Sean A. Irvine
 */
public class A155695 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
