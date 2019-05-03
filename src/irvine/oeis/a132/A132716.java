package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132716 Decimal expansion of <code>26/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132716 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(26).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
