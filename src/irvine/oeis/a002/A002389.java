package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002389 Decimal expansion of -log(gamma), where gamma is Euler's constant A001620.
 * @author Sean A. Irvine
 */
public class A002389 extends DecimalExpansionSequence {

  private static final CR N = CR.GAMMA.log().negate();

  @Override
  protected CR getCR() {
    return N;
  }
}
