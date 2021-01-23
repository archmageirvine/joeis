package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160388 Decimal expansion of (e + 1)/3.
 * @author Sean A. Irvine
 */
public class A160388 extends DecimalExpansionSequence {

  private static final CR N = CR.E.add(CR.ONE).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
