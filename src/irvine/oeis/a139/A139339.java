package irvine.oeis.a139;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A139339.
 * @author Sean A. Irvine
 */
public class A139339 extends DecimalExpansionSequence {

  private static final CR N = CR.PHI.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
