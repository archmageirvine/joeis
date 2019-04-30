package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020849 Decimal expansion of <code>1/sqrt(92)</code>.
 * @author Sean A. Irvine
 */
public class A020849 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(92).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
