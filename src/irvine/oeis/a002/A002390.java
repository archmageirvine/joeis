package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002390.
 * @author Sean A. Irvine
 */
public class A002390 extends DecimalExpansionSequence {

  private static final CR LN_PHI = CR.PHI.log();

  @Override
  protected CR getCR() {
    return LN_PHI;
  }
}
