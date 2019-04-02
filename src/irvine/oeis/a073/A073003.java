package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073003 Decimal expansion of -exp(1)*Ei(-1), also called Gompertz's constant, or the Euler-Gompertz constant.
 * @author Sean A. Irvine
 */
public class A073003 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.negate().ei().negate().multiply(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
