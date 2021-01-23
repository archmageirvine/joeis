package irvine.oeis.a093;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093766 Decimal expansion of Pi/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A093766 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(12).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
