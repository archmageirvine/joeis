package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011104.
 * @author Sean A. Irvine
 */
public class A011104 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
