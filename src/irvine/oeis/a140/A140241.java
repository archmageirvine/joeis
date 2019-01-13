package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140241.
 * @author Sean A. Irvine
 */
public class A140241 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(7).divide(CR.valueOf(8))).multiply(CR.valueOf(180)).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
