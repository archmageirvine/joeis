package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073229 Decimal expansion of e^(1/e).
 * @author Sean A. Irvine
 */
public class A073229 extends DecimalExpansionSequence {

  private static final CR N = CR.E.inverse().exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
