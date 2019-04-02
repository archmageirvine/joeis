package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011233 Decimal expansion of 9th root of 7.
 * @author Sean A. Irvine
 */
public class A011233 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(7), CR.valueOf(9).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
