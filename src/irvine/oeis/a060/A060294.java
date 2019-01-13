package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A060294.
 * @author Sean A. Irvine
 */
public class A060294 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
