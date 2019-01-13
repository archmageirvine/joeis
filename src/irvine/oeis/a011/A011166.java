package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011166.
 * @author Sean A. Irvine
 */
public class A011166 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(81), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
