package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010503.
 * @author Sean A. Irvine
 */
public class A010503 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT2.inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
