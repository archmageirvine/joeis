package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011350 Decimal expansion of 6th root of 15.
 * @author Sean A. Irvine
 */
public class A011350 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.SIX.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
