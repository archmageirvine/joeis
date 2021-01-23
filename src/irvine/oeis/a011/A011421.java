package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011421 Decimal expansion of 17th root of 19.
 * @author Sean A. Irvine
 */
public class A011421 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(17).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
