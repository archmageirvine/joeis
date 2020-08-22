package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A333419 Decimal expansion of the error function at 1/2, erf(1/2).
 * @author Sean A. Irvine
 */
public class A333419 extends DecimalExpansionSequence {

  private static final CR N = CR.HALF.erf();

  @Override
  protected CR getCR() {
    return N;
  }
}
