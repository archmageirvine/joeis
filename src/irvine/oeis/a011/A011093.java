package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011093.
 * @author Sean A. Irvine
 */
public class A011093 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(8), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
