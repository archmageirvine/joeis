package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140245 Decimal expansion of <code>180*arccos(-1/4)/Pi</code>.
 * @author Sean A. Irvine
 */
public class A140245 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(-4).inverse()).multiply(CR.valueOf(180)).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
