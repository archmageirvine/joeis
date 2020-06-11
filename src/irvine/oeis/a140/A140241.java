package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140241 Decimal expansion of <code>180*arccos(7/8)/Pi</code>.
 * @author Sean A. Irvine
 */
public class A140241 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.SEVEN.divide(CR.EIGHT)).multiply(180).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
