package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155004.
 * @author Sean A. Irvine
 */
public class A155004 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
