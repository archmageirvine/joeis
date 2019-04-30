package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020854 Decimal expansion of <code>1/sqrt(97)</code>.
 * @author Sean A. Irvine
 */
public class A020854 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(97).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
