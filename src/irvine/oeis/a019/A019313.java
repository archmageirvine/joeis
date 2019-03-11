package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019313.
 * @author Sean A. Irvine
 */
public class A019313 extends DecimalExpansionSequence {

  private static final CR N = CR.E.add(CR.TAU);

  @Override
  protected CR getCR() {
    return N;
  }
}
