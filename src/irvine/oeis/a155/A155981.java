package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155981.
 * @author Sean A. Irvine
 */
public class A155981 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
