package irvine.oeis.a039;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A039661 Decimal expansion of exp(Pi).
 * @author Sean A. Irvine
 */
public class A039661 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
