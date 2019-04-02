package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011311 Decimal expansion of 12th root of 12.
 * @author Sean A. Irvine
 */
public class A011311 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(12).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
