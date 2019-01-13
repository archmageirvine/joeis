package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011247.
 * @author Sean A. Irvine
 */
public class A011247 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(8), CR.valueOf(8).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
