package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155995.
 * @author Sean A. Irvine
 */
public class A155995 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
