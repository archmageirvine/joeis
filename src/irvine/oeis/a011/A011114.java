package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011114.
 * @author Sean A. Irvine
 */
public class A011114 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(29), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
