package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A003077 Decimal expansion of <code>22/7 -</code> Pi.
 * @author Sean A. Irvine
 */
public class A003077 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).divide(CR.valueOf(7)).subtract(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
