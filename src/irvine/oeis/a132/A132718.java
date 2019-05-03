package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132718 Decimal expansion of <code>28/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132718 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(28).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
