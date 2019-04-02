package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019779.
 * @author Sean A. Irvine
 */
public class A019779 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return N;
  }
}
