package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156164 Decimal expansion of 17 + 12*sqrt(2).
 * @author Sean A. Irvine
 */
public class A156164 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).add(CR.valueOf(288).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
