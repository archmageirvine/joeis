package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A072691.
 * @author Sean A. Irvine
 */
public class A072691 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
