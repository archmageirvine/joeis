package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020796 Decimal expansion of <code>1/sqrt(39)</code>.
 * @author Sean A. Irvine
 */
public class A020796 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(39).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
