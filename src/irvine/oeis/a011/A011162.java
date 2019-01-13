package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011162.
 * @author Sean A. Irvine
 */
public class A011162 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(77), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
