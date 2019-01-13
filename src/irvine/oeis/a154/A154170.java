package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154170.
 * @author Sean A. Irvine
 */
public class A154170 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
