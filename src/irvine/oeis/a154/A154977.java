package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154977.
 * @author Sean A. Irvine
 */
public class A154977 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
