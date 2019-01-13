package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002161.
 * @author Sean A. Irvine
 */
public class A002161 extends DecimalExpansionSequence {

  private static final CR SQRT_PI = CR.PI.sqrt();

  @Override
  protected CR getCR() {
    return SQRT_PI;
  }
}
