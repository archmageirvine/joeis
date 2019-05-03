package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011417 Decimal expansion of <code>13th</code> root of 19.
 * @author Sean A. Irvine
 */
public class A011417 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(13).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
