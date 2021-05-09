package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091681 Decimal expansion of BesselJ(0,2).
 * @author Sean A. Irvine
 */
public class A091681 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.besselJ0();

  @Override
  protected CR getCR() {
    return N;
  }
}
