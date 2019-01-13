package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156029.
 * @author Sean A. Irvine
 */
public class A156029 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
