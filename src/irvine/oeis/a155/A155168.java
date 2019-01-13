package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155168.
 * @author Sean A. Irvine
 */
public class A155168 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
