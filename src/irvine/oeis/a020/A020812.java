package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020812 Decimal expansion of <code>1/sqrt(55)</code>.
 * @author Sean A. Irvine
 */
public class A020812 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(55).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
