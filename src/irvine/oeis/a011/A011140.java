package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011140.
 * @author Sean A. Irvine
 */
public class A011140 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(55), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
