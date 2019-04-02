package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073226 Decimal expansion of e^e.
 * @author Sean A. Irvine
 */
public class A073226 extends DecimalExpansionSequence {

  private static final CR N = CR.E.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
