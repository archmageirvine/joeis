package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019776.
 * @author Sean A. Irvine
 */
public class A019776 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
