package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019753.
 * @author Sean A. Irvine
 */
public class A019753 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return N;
  }
}
