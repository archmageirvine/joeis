package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020763 Decimal expansion of 1/sqrt(6).
 * @author Sean A. Irvine
 */
public class A020763 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
