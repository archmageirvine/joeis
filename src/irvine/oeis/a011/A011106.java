package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011106.
 * @author Sean A. Irvine
 */
public class A011106 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(21), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
