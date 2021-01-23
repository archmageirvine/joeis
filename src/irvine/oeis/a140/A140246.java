package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140246 Decimal expansion of sqrt(15)/6.
 * @author Sean A. Irvine
 */
public class A140246 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).sqrt().divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
