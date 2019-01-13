package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011150.
 * @author Sean A. Irvine
 */
public class A011150 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(65), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
