package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A060295.
 * @author Sean A. Irvine
 */
public class A060295 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.valueOf(163).sqrt()).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
