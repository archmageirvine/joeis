package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011335 Decimal expansion of 6th root of 14.
 * @author Sean A. Irvine
 */
public class A011335 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(6).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
