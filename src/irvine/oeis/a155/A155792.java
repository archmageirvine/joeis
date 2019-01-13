package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155792.
 * @author Sean A. Irvine
 */
public class A155792 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
