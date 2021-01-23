package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011232 Decimal expansion of 8th root of 7.
 * @author Sean A. Irvine
 */
public class A011232 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SEVEN, CR.EIGHT.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
