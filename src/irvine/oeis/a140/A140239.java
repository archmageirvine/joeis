package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140239 Decimal expansion of <code>3*sqrt(15)/4</code>.
 * @author Sean A. Irvine
 */
public class A140239 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(135).sqrt().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
