package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132713 Decimal expansion of <code>23/Pi</code>.
 * @author Sean A. Irvine
 */
public class A132713 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
