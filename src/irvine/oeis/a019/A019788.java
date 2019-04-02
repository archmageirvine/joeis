package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019788.
 * @author Sean A. Irvine
 */
public class A019788 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
