package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156649 Decimal expansion of (9+4*sqrt(2))/7.
 * @author Sean A. Irvine
 */
public class A156649 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.add(CR.valueOf(32).sqrt()).divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
