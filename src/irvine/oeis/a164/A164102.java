package irvine.oeis.a164;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A164102 Decimal expansion of 2*Pi^2.
 * @author Sean A. Irvine
 */
public class A164102 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).multiply(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
