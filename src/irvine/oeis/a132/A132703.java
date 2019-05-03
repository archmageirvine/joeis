package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132703 Decimal expansion of <code>13/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132703 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
