package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011007 Decimal expansion of 4th root of 10.
 * @author Sean A. Irvine
 */
public class A011007 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TEN, CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
