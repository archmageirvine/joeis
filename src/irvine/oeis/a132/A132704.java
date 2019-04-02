package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132704 Decimal expansion of 14/Pi.
 * @author Sean A. Irvine
 */
public class A132704 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
