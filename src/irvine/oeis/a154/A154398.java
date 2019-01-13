package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154398.
 * @author Sean A. Irvine
 */
public class A154398 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
