package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132711 Decimal expansion of <code>21/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132711 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
