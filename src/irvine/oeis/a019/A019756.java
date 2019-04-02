package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019756.
 * @author Sean A. Irvine
 */
public class A019756 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
