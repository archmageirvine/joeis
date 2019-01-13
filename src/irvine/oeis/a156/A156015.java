package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156015.
 * @author Sean A. Irvine
 */
public class A156015 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
