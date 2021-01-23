package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011343 Decimal expansion of 14th root of 14.
 * @author Sean A. Irvine
 */
public class A011343 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(14).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
