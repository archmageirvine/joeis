package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A061360.
 * @author Sean A. Irvine
 */
public class A061360 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
