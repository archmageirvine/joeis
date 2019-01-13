package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011071.
 * @author Sean A. Irvine
 */
public class A011071 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(79), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
