package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154190.
 * @author Sean A. Irvine
 */
public class A154190 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
