package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155936.
 * @author Sean A. Irvine
 */
public class A155936 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
