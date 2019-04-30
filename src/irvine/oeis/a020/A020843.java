package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020843 Decimal expansion of <code>1/sqrt(86)</code>.
 * @author Sean A. Irvine
 */
public class A020843 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(86).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
