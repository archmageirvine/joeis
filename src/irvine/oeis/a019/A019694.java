package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019694.
 * @author Sean A. Irvine
 */
public class A019694 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.PI).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
