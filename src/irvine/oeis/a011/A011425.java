package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011425 Decimal expansion of 6th root of 20.
 * @author Sean A. Irvine
 */
public class A011425 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.SIX.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
