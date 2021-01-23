package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086201 Decimal expansion of 1/(2*Pi).
 * @author Sean A. Irvine
 */
public class A086201 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.PI).inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
