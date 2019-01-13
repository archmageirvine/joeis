package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154492.
 * @author Sean A. Irvine
 */
public class A154492 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
