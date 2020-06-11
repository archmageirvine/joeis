package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155044 Decimal expansion of <code>log_6 (19)</code>.
 * @author Sean A. Irvine
 */
public class A155044 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
