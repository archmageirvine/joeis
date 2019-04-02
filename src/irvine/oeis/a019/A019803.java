package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019803.
 * @author Sean A. Irvine
 */
public class A019803 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
