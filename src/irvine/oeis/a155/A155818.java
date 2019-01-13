package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155818.
 * @author Sean A. Irvine
 */
public class A155818 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
