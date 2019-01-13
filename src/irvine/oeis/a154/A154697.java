package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154697.
 * @author Sean A. Irvine
 */
public class A154697 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
