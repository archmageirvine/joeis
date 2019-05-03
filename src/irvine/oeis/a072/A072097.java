package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A072097 Decimal expansion of <code>180/Pi</code>.
 * @author Sean A. Irvine
 */
public class A072097 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(180).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
