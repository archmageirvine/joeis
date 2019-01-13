package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011179.
 * @author Sean A. Irvine
 */
public class A011179 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(94), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
