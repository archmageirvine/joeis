package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140242 Decimal expansion of arccos(11/16).
 * @author Sean A. Irvine
 */
public class A140242 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(11).divide(CR.valueOf(16)));

  @Override
  protected CR getCR() {
    return N;
  }
}
