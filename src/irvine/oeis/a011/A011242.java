package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011242 Decimal expansion of 18th root of 7.
 * @author Sean A. Irvine
 */
public class A011242 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(7), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
