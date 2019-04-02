package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011188 Decimal expansion of 9th root of 4.
 * @author Sean A. Irvine
 */
public class A011188 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(9).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
