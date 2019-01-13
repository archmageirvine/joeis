package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019740.
 * @author Sean A. Irvine
 */
public class A019740 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
