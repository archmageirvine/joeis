package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A053510.
 * @author Sean A. Irvine
 */
public class A053510 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
