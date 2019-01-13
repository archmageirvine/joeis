package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140249.
 * @author Sean A. Irvine
 */
public class A140249 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(135).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
