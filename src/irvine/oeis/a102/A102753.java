package irvine.oeis.a102;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A102753 Decimal expansion of <code>(Pi^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A102753 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
