package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A036793 Decimal expansion of (2/Pi)*Integral_{x=0..Pi} sin(x)/x.
 * @author Sean A. Irvine
 */
public class A036793 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.si().multiply(2).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
