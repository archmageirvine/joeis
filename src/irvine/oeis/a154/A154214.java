package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154214.
 * @author Sean A. Irvine
 */
public class A154214 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
