package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154161.
 * @author Sean A. Irvine
 */
public class A154161 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
