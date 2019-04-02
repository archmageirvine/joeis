package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011159 Decimal expansion of 5th root of 74.
 * @author Sean A. Irvine
 */
public class A011159 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(74), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
