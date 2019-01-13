package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155679.
 * @author Sean A. Irvine
 */
public class A155679 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
