package irvine.oeis.a139;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A139341.
 * @author Sean A. Irvine
 */
public class A139341 extends DecimalExpansionSequence {

  private static final CR N = CR.PHI.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
