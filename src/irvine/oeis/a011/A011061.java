package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011061.
 * @author Sean A. Irvine
 */
public class A011061 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(69), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
