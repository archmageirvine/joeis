package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007524.
 * @author Sean A. Irvine
 */
public class A007524 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(10).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
