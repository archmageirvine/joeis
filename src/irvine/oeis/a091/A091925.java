package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091925 Decimal expansion of <code>Pi^3</code>.
 * @author Sean A. Irvine
 */
public class A091925 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).multiply(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
