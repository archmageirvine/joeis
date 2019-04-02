package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019798.
 * @author Sean A. Irvine
 */
public class A019798 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
