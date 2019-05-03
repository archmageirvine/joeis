package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132696 Decimal expansion of <code>6/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132696 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
