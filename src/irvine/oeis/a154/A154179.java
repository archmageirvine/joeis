package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154179.
 * @author Sean A. Irvine
 */
public class A154179 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
